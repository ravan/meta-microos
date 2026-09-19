SUMMARY = "Library to access Windows 9x/Me REGF-type Registry files"
DESCRIPTION = "libcreg is a library to access Windows 9x/Me Registry files of the REGF \
type (a non-text representation)."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20260523"

RPM_NAME = "python314-libcreg-20260523-1.10.aarch64.rpm"
RPM_HASH = "38cfbcbd5386b7d4082ffcd2cdaa18bf98e997af45117e8668fb0393cc0d4da7e6589a4d9ba9878bad031989e32d71a8962b1fa749b15a168717265ee7e66b78"

RPROVIDES:${PN} += "python314-libcreg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcreg.so.1 \
python-abi"

inherit rpm
