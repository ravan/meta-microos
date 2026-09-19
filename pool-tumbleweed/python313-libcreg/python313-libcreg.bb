SUMMARY = "Library to access Windows 9x/Me REGF-type Registry files"
DESCRIPTION = "libcreg is a library to access Windows 9x/Me Registry files of the REGF \
type (a non-text representation)."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20260523"

RPM_NAME = "python313-libcreg-20260523-1.10.aarch64.rpm"
RPM_HASH = "cffddd0ab435bc375f1006332144167e6e8e1fc9a8ab425712a8311f53f4bfcde5e52912b450cbf65279b222e2fb591fd2cb1d8542bd759e4d8f65813a644fc7"

RPROVIDES:${PN} += "python3-libcreg \
python313-libcreg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcreg.so.1 \
python-abi"

inherit rpm
