SUMMARY = "Program to unpack LHARC archives"
DESCRIPTION = "Lhasa is a replacement for the Unix LHA tool, for decompressing \
'.lzh' (LHA/LHarc) and '.lzs' (LArc) archives."
LICENSE = "ISC"

PV = "0.6.0"

RPM_NAME = "lhasa-0.6.0-1.3.aarch64.rpm"
RPM_HASH = "d15df492391551cb721337f6303f34591cf90b7d6f528a865069a854bb6437334369d2b6198426dd84c4cd023b70aa8cc58979ba77dfb1ecd8865b8ecc7f937e"

RPROVIDES:${PN} += "lhasa"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblhasa.so.0"

inherit rpm
