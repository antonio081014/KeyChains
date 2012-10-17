/**
 * 
 */
package com.antonio081014.keychains.entity;

/**
 * @author antonio081014
 * 
 */
public class Merchant {

	private int _MID;
	private String _email;
	private String _name;
	private String _address;
	private String _website;

	public Merchant(String _email, String _name, String _address,
			String _website) {
		this._email = _email;
		this._name = _name;
		this._address = _address;
		this._website = _website;
	}

	public Merchant(int _ID, String _email, String _name, String _address,
			String _website) {
		this._MID = _ID;
		this._email = _email;
		this._name = _name;
		this._address = _address;
		this._website = _website;
	}

	public int get_ID() {
		return _MID;
	}

	public void set_ID(int _ID) {
		this._MID = _ID;
	}

	public String get_email() {
		return _email;
	}

	public void set_email(String _email) {
		this._email = _email;
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public String get_address() {
		return _address;
	}

	public void set_address(String _address) {
		this._address = _address;
	}

	public String get_website() {
		return _website;
	}

	public void set_website(String _website) {
		this._website = _website;
	}

}
