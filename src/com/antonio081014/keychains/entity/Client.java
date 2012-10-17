/**
 * 
 */
package com.antonio081014.keychains.entity;

/**
 * @author antonio081014
 * 
 */
public class Client {

	private int _UID;
	private String _name;
	private String _email;
	private String _pwd;
	private int _PLID;

	public Client(String _name, String _email, String _pwd) {
		this(-1, _name, _email, _pwd, -1);
	}

	public Client(int _UID, String _name, String _email, String _pwd, int _PLID) {
		this._UID = _UID;
		this._name = _name;
		this._email = _email;
		this._pwd = _pwd;
		this._PLID = _PLID;
	}

	public int get_UID() {
		return _UID;
	}

	public void set_UID(int _UID) {
		this._UID = _UID;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public String get_email() {
		return _email;
	}

	public void set_email(String _email) {
		this._email = _email;
	}

	public String get_pwd() {
		return _pwd;
	}

	public void set_pwd(String _pwd) {
		this._pwd = _pwd;
	}

	public int get_PLID() {
		return _PLID;
	}

	public void set_PLID(int _PLID) {
		this._PLID = _PLID;
	}

}
