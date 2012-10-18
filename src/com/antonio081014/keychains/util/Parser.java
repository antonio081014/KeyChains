/**
 * 
 */
package com.antonio081014.keychains.util;

import com.antonio081014.keychains.entity.Merchant;
import com.google.gson.Gson;

/**
 * @author "Dev Perfecular Inc."
 * @time: Oct 17, 2012, 11:38:17 AM
 */
public class Parser {

    public Merchant parse2Merchant(String s) {
	Gson gson = new Gson();

	// String email;
	// String name;
	// String address;
	// String website;
	// Merchant merchant = new Merchant(email, name, address, website);
	Merchant merchant = gson.fromJson(s, Merchant.class);
	return merchant;
    }
}
