SUMMARY = "Tools for libaccounts-glib"
DESCRIPTION = "This package contains the tools for the accounts-glib library."
LICENSE = "LGPL-2.1-only"

PV = "1.27"

RPM_NAME = "libaccounts-glib-tools-1.27-1.10.aarch64.rpm"
RPM_HASH = "faf5188925de15a30f537cef836052dc6df6ed9ca263f384356d16d20e41f88f8d7ff83b609f8c9c39981dfd561f14ca25ce5a69f7ee90dae18c2df69f8ce99b"

RPROVIDES:${PN} += "libaccounts-glib-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libaccounts-glib.so.0 \
libaccounts-glib0 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsqlite3.so.0"

inherit rpm
