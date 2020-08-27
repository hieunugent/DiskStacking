function diskStacking(disks) {
  // Write your code here.
	disks.sort((a, b)=> a[2] -b[2]);
	const sequences = new Array(disks.length);
	const heights = disks.map(disk => disk[2]);
	let maxHeightIdx = 0;
	for(let i = 1; i < disks.length; i++){
		const currentDisk = disks[i];
		for(let j = 0; j < i; j++){
			const otherDisk = disks[j];
			if(isValidDimensions(otherDisk, currentDisk)){
				if(heights[i] <= currentDisk[2] + heights[j]){
					heights[i] = currentDisk[2] + heights[j];
					sequences[i] = j;
				}
			}
		}
		if(heights[i] >= heights[maxHeightIdx]) maxHeightIdx = i;
		
	}
	return buildSequence(disks, sequences, maxHeightIdx );
}
	function isValidDimensions(o, c){
		return o[0] < c[0] && o[1] < c[1] && o[2] < c[2];
	}
	function buildSequence(array, sequences, currentIdx){
		const sequence = [];
		while(currentIdx !== undefined){
			sequence.unshift(array[currentIdx]);
			currentIdx = sequences[currentIdx];
		}
		return sequence;
	}

// Do not edit the line below.
exports.diskStacking = diskStacking;
