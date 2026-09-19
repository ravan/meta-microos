SUMMARY = "Python wrapper for extended filesystem attributes"
DESCRIPTION = "Extended attributes extend the basic attributes of files and directories \
in the file system.  They are stored as name:data pairs associated with \
file system objects (files, directories, symlinks, etc). \
 \
Extended attributes are currently only available on Darwin 8.0+ (Mac OS X 10.4) \
and Linux 2.6+. Experimental support is included for Solaris and FreeBSD."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python314-xattr-1.3.0-1.7.aarch64.rpm"
RPM_HASH = "ddddc4649b6b88bc14359c06cdae6d1c3cff538a88a8d9d27a388373da93592d13eed2674bbf2e09c627ee87dc080487ee2aa71ba3fd9a7a012aca2226f74d9c"

RPROVIDES:${PN} += "python3.14dist-xattr \
python314-xattr \
python3dist-xattr"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi \
python314-cffi"

inherit rpm
