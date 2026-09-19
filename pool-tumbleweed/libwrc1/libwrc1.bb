SUMMARY = "Library to support the Windows Resource Compiler format"
DESCRIPTION = "libwrc is a library to support the Windows Resource Compiler format."
LICENSE = "LGPL-3.0-or-later"

PV = "20260705"

RPM_NAME = "libwrc1-20260705-1.2.aarch64.rpm"
RPM_HASH = "f794a577539b98cff27e01b5331ec20d2d23653cc807def50da9779a01372fdd01279062a267a48cce7977b247fc0a90c470599dc476191aa8c138f2ee14e12b"

RPROVIDES:${PN} += "libwrc.so.1 \
libwrc1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfvalue.so.1 \
libuna.so.1"

inherit rpm
