SUMMARY = "RFC 7049 - Concise Binary Object Representation"
DESCRIPTION = "RFC 7049 - Concise Binary Object Representation"
LICENSE = "Apache-2.0"

PV = "1.0.0"

RPM_NAME = "python314-cbor-1.0.0-2.7.aarch64.rpm"
RPM_HASH = "4506cc126e75c7e7ee1fdc6265131e5b171b7f03349ef0b1949fd7c35c8a65bb0fef0ecc1a8cd0f3098dfb88147c3e61f5cb40e719bfd1c0944486ddaf0f4566"

RPROVIDES:${PN} += "python3.14dist-cbor \
python314-cbor \
python3dist-cbor"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
