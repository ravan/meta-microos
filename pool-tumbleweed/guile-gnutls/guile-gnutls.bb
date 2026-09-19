SUMMARY = "Guile bindings to GnuTLS"
DESCRIPTION = "GnuTLS wrappers for GNU Guile, a dialect of Scheme."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.2"

RPM_NAME = "guile-gnutls-5.0.2-1.2.aarch64.rpm"
RPM_HASH = "a8208cfa80a2ba0503e3bd0394c6aec0080df4ac546379ca47a2c455283371c2d07692e28126c01675004565315d8abc52fd4fb901259ea2504e4c832d76b515"

RPROVIDES:${PN} += "gnutls-guile \
guile-gnutls"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgnutls.so.30 \
libguile-3.0.so.1"

inherit rpm
