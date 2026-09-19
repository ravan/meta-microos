SUMMARY = "Library to parse MS Internet Explorer Cache Files"
DESCRIPTION = "libmsiecf is a library to parse MS Internet Explorer Cache Files."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20260525"

RPM_NAME = "python313-libmsiecf-20260525-1.11.aarch64.rpm"
RPM_HASH = "48e17e7a29ee44858584d211389db296abf71061301c7cdb6406e7f5d68fd9610146383aa91dde14a51b88edbb3b83b09eca4375de71913123a6acccf40b03b1"

RPROVIDES:${PN} += "python3-libmsiecf \
python313-libmsiecf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libmsiecf.so.1 \
python-abi"

inherit rpm
