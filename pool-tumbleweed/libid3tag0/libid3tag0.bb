SUMMARY = "ID3 Tag Manipulation Library"
DESCRIPTION = "libid3tag is a library for reading and writing ID3 tags, both ID3v1 and \
the various versions of ID3v2."
LICENSE = "GPL-2.0-or-later"

PV = "0.16.3"

RPM_NAME = "libid3tag0-0.16.3-1.11.aarch64.rpm"
RPM_HASH = "f63e6ac682cbc9c5743b90e7592263e6d39347697f50b511856d44fc9b70888498b78bc1fa4b83541d211934462b049ec9a004fd6c77933196f5a311ab598e9c"

RPROVIDES:${PN} += "libid3tag.so.0 \
libid3tag0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1"

inherit rpm
