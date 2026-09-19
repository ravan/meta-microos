SUMMARY = "Multi-core gzip version"
DESCRIPTION = "A parallel implementation of gzip for modern multi-processor, multi-core machines"
LICENSE = "Zlib"

PV = "2.8"

RPM_NAME = "pigz-2.8-2.11.aarch64.rpm"
RPM_HASH = "0ac9aa3efd0105a4a8c23c3ee65673f2052670c6dff483c273cd042155382352edf2a2d52e7221cc860c4a09a8358612120077ddad720495ba840bddcf61ac9b"

RPROVIDES:${PN} += "pigz"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libz.so.1"

inherit rpm
