SUMMARY = "Lasso runtime libraries"
DESCRIPTION = "This package contains the runtime libraries for lasso (Liberty Alliance Single Sign On)."
LICENSE = "GPL-2.0-or-later"

PV = "2.9.0"

RPM_NAME = "liblasso3-2.9.0-1.7.aarch64.rpm"
RPM_HASH = "b25a9ce7c9a959f78765fd3f23e3bed8e67127efebba8c020392812c84efd025c3aa324a49d048e4238ac7eb524d6572463d76641b6973b4fddab5952f01293e"

RPROVIDES:${PN} += "liblasso.so.3 \
liblasso3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libxml2.so.16 \
libxmlsec1-openssl.so.1 \
libxmlsec1.so.1 \
libxslt.so.1 \
libz.so.1"

inherit rpm
