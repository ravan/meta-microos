SUMMARY = "Library to access Windows REGF-type Registry files"
DESCRIPTION = "libregf is a library to access Windows Registry files of the REGF \
type (a non-text representation)."
LICENSE = "LGPL-3.0-or-later"

PV = "20260526"

RPM_NAME = "libregf1-20260526-1.10.aarch64.rpm"
RPM_HASH = "fd10e4ce8c2cd44ebed492a48bf291e6c4ad51bd807304030ace18a2a6367c0df22d63cc3c3bd694494a84bea0db6bc2b0c3924f9412acfa02e433497c393851"

RPROVIDES:${PN} += "libregf.so.1 \
libregf1"

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
