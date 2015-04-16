package simpledb.buffer;

import java.util.HashMap;

import simpledb.file.Block;

public class BufferPoolMap{
	HashMap<Block, Buffer> map= new HashMap<Block, Buffer>();

	public boolean containsKey(Block blk) {
		// TODO Auto-generated method stub
		return map.containsKey(blk);
	}

	public Buffer get(Block blk) {
		// TODO Auto-generated method stub
		return map.get(blk);
	}
	public void put(Block block,Buffer buffer){
		map.put(block, buffer);
	}
	public void del(Block block){
		map.remove(block);
	}

}
