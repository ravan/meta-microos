SUMMARY = "Library to access Windows REGF-type Registry files"
DESCRIPTION = "libregf is a library to access Windows Registry files of the REGF \
type (a non-text representation)."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20260526"

RPM_NAME = "python313-libregf-20260526-1.10.aarch64.rpm"
RPM_HASH = "8740564b4ffa8beae0489d21017f3c5b753cdfd1564a4d9465b85cabd4b1637f3c89eb45c45c09409a7beda9838e517304db42b85d636867aed3dbc5ff822216"

RPROVIDES:${PN} += "python3-libregf \
python313-libregf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libregf.so.1 \
libuna.so.1 \
python-abi"

inherit rpm
