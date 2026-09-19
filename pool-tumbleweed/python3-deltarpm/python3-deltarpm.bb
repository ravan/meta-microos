SUMMARY = "Tools to Create and Apply deltarpms"
DESCRIPTION = "Python 3 bindings for deltarpm"
LICENSE = "BSD-3-Clause"

PV = "3.6.5"

RPM_NAME = "python3-deltarpm-3.6.5-1.10.aarch64.rpm"
RPM_HASH = "bb965fe8374eb89290a60bd27704a9baa7384c0a08335716dcf9886d4f4a0b789d24f89686ff923ec91c45678f737257b5c8b7057eda1f0ecca38d67010d4508"

RPROVIDES:${PN} += "python3-deltarpm"

RDEPENDS:${PN} += "deltarpm \
ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
liblzma.so.5 \
libzstd.so.1 \
python-abi"

inherit rpm
