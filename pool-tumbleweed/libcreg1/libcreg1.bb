SUMMARY = "Library to access Windows 9x/Me REGF-type Registry files"
DESCRIPTION = "libcreg is a library to access Windows 9x/Me Registry files of the REGF \
type (a non-text representation)."
LICENSE = "LGPL-3.0-or-later"

PV = "20260523"

RPM_NAME = "libcreg1-20260523-1.10.aarch64.rpm"
RPM_HASH = "c467e1f7f032bc2f2ae8369e1263f49458205b08f0d17743f206e48037df06ce8f8acc461355741e1fcfd3ef0f272f534b3eb185be69e6802f89c6b073ea0965"

RPROVIDES:${PN} += "libcreg.so.1 \
libcreg1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcthreads.so.1 \
libfcache.so.1 \
libfdata.so.1 \
libuna.so.1"

inherit rpm
