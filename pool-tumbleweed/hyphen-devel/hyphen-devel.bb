SUMMARY = "Files for Developing with hyphen"
DESCRIPTION = "Hyphen is a library for high quality hyphenation and justification. \
 \
This package contains the hyphen development files."
LICENSE = "GPL-2.0-or-later | LGPL-2.0-or-later | MPL-1.1+"

PV = "2.8.9"

RPM_NAME = "hyphen-devel-2.8.9-1.3.aarch64.rpm"
RPM_HASH = "398e854d07277827e30af7d8eb19d9e4de51770888bffead353a8ca916928a52fc6dc1fd69a55c30ca7b3aa8c8e386ef828153dfed805a21a9533868097b9c49"

RPROVIDES:${PN} += "hyphen-devel"

RDEPENDS:${PN} += "/usr/bin/perl \
libhyphen0"

inherit rpm
