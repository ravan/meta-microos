SUMMARY = "Multipattern regular expression searching for digital forensics"
DESCRIPTION = "liblightgrep is a regular expression engine designed \
for digital forensics. \
 \
* it searches for many patterns simultaneously, \
* searches binary data as a stream, not as discrete lines of text, \
* searches for patterns in many different encodings, \
* is a forward-looking only engine"
LICENSE = "LGPL-3.0-or-later"

PV = "1.4"

RPM_NAME = "liblightgrep0-1.4-7.6.aarch64.rpm"
RPM_HASH = "8a5c19db9f44c3c1cf0c9ea25749e72e8b38d97dffbc5b2b7e1f42fab701249427aa6be3347f8b9cd4bcde653455c97e63bb246f639e2c542e75f7b90af1f940"

RPROVIDES:${PN} += "liblightgrep.so.0 \
liblightgrep0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libicuuc.so.78 \
libstdc++.so.6"

inherit rpm
