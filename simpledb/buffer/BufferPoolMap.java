package simpledb.buffer;

import java.util.HashMap;

import simpledb.file.Block;

public class BufferPoolMap{
	HashMap<Block, Buffer> map= new HashMap<Block, Buffer>();

	public boolean containsKey(Block blk) {//check whether map has an entry for specific block
		// TODO Auto-generated method stub
		return map.containsKey(blk);
	}

	public Buffer get(Block blk) {//return buffer
		// TODO Auto-generated method stub
		return map.get(blk);
	}
	public void put(Block block,Buffer buffer){//add mapping entry
		map.put(block, buffer);
	}
	public void del(Block block){//delete entry
		map.remove(block);
	}

}
