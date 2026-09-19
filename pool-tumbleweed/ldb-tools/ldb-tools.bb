SUMMARY = "Tools to manipulate LDB files"
DESCRIPTION = "Tools to manipulate LDB files."
LICENSE = "GPL-3.0-or-later"

PV = "4.24.6+git.488.e38f6c96c62"

RPM_NAME = "ldb-tools-4.24.6+git.488.e38f6c96c62-1.1.aarch64.rpm"
RPM_HASH = "6cd548794230fe4e537a030826c6a0e24b813d08f1fb54e70e5bc91081cbaf2913c2d51dac3b374201da2744afc53cbb5d3eb2f1b3f27ad1b909d0947b5773e0"

RPROVIDES:${PN} += "ldb-tools \
libldb-cmdline-private-samba.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libldb.so.2 \
libpopt.so.0 \
libtalloc.so.2"

inherit rpm
