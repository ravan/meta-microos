SUMMARY = "Python wrapper for extended filesystem attributes"
DESCRIPTION = "Extended attributes extend the basic attributes of files and directories \
in the file system.  They are stored as name:data pairs associated with \
file system objects (files, directories, symlinks, etc). \
 \
Extended attributes are currently only available on Darwin 8.0+ (Mac OS X 10.4) \
and Linux 2.6+. Experimental support is included for Solaris and FreeBSD."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python313-xattr-1.3.0-1.7.aarch64.rpm"
RPM_HASH = "29f2f0b3d434d07a6e131e3be53fa0c8b31b165751519c24af18b2615113d05c9293744fd0e7aa936f8a3817027b5a0e5176b222de2e967a137391b36ac63a41"

RPROVIDES:${PN} += "python3-xattr \
python3.13dist-xattr \
python313-xattr \
python3dist-xattr"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python313-cffi"

inherit rpm
