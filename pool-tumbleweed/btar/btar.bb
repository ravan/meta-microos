SUMMARY = "Featureful tar-Compatible Archiver and Compressor"
DESCRIPTION = "btar is a tar-compatible archiver which allows arbitrary compression and \
ciphering, redundancy, differential backup, indexed extraction, multicore \
compression, input and output serialisation, and tolerance to partial \
archive errors."
LICENSE = "GPL-3.0-or-later"

PV = "1.1.1"

RPM_NAME = "btar-1.1.1-2.23.aarch64.rpm"
RPM_HASH = "6d5f6218db19abbbd551edc10168e8d21bb0ab6f8d827c2312018b6eff2365253502604cf1f9e11f2d349725c5ff9804fd531fd43110ca9f88c6effd8ac0b505"

RPROVIDES:${PN} += "btar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librsync.so.2"

inherit rpm
