SUMMARY = "Library to access Windows REGF-type Registry files"
DESCRIPTION = "libregf is a library to access Windows Registry files of the REGF \
type (a non-text representation)."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20260526"

RPM_NAME = "python314-libregf-20260526-1.10.aarch64.rpm"
RPM_HASH = "36a4c2e1c61d42ca360e8666e11e83d045c6bfd058328c24b12694ae92a5f43636dcfb16551d519c7ff0b0396705ac2fbe3cd00a905b1fd97ecdf4d975bdc49f"

RPROVIDES:${PN} += "python314-libregf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libregf.so.1 \
libuna.so.1 \
python-abi"

inherit rpm
