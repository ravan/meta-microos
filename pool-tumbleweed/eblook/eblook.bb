SUMMARY = "Command Line Tool for Searching Electronic Dictionaries"
DESCRIPTION = "eblook is a command line tool that uses the EB library. It provides \
easy access to many electronic dictionaries published on CD-ROM. \
 \
It is recommended that you install the Emacs interface lookup.el, too. \
Although it is possible to use eblook from the command line, using it \
with Emacs or XEmacs and lookup.el is much easier and offers many extra \
features. \
 \
You can get lookup.el from http://lookup.sourceforge.net/. \
 \
lookup.el is already included as a package in recent versions of \
XEmacs."
LICENSE = "GPL-2.0-or-later"

PV = "1.6.1"

RPM_NAME = "eblook-1.6.1-162.9.aarch64.rpm"
RPM_HASH = "5757eac486fb729e96c4208e40bae2ba9060907f3d2305c208184b9c8bca29114cf38127f81192c15cb492d1b9fbde0550e262794d38d108fc2c2ed49f78413f"

RPROVIDES:${PN} += "eblook"

RDEPENDS:${PN} += "/usr/bin/sh \
eb \
ld-linux-aarch64.so.1 \
libc.so.6 \
libeb.so.16"

inherit rpm
