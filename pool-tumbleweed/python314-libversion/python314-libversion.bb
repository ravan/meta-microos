SUMMARY = "Python bindings for libversion"
DESCRIPTION = "Libversion is an advanced version string comparison library. It can \
compare versions of software packages, including complex cases like \
1.2-x.3~alpha4. Is is used by the Repology project. \
 \
This package contains the Python bindings for libversion."
LICENSE = "MIT"

PV = "1.2.4"

RPM_NAME = "python314-libversion-1.2.4-1.14.aarch64.rpm"
RPM_HASH = "f4cf48ad7f6d24c6c0585c2dab461d8dbf40aae0ccce8d4f17915efdc3433b67249de8029a23601c97d10d15f8ccbcd477e585dd2da4e7a91199574879e0548d"

RPROVIDES:${PN} += "python3.14dist-libversion \
python314-libversion \
python3dist-libversion"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libversion.so.1 \
python-abi"

inherit rpm
