/**
 * 
 */
package com.antonio081014.keychains.entity;

import android.annotation.SuppressLint;
import java.util.List;

/**
 * @author antonio081014
 * 
 */

public class ProgramList {

	private int _PLID;
	private List<Integer> _programList;

	/**
	 * @param _programList
	 */
	public ProgramList(List<Integer> _programList) {
		this._programList = _programList;
	}

	/**
	 * @param _PLID
	 * @param _programList
	 */
	public ProgramList(int _PLID, List<Integer> _programList) {
		this._PLID = _PLID;
		this._programList = _programList;
	}

	public int get_PLID() {
		return _PLID;
	}

	public void set_PLID(int _PLID) {
		this._PLID = _PLID;
	}

	public List<Integer> get_programList() {
		return _programList;
	}

	public void set_programList(List<Integer> _programList) {
		this._programList = _programList;
	}

	public void addProgram(int programID) {
		if (this.get_programList().contains(programID))
			return;
		this.get_programList().add(programID);
	}

	public void deleteProgram(int programID) {
		this.get_programList().remove(Integer.valueOf(programID));
	}
}
