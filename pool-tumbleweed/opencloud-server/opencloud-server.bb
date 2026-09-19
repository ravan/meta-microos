SUMMARY = "Secure and private way to store, access, and share your files"
DESCRIPTION = "OpenCloud is an open-source project that gives you a secure and private way to \
store, access, and share your files. \
 \
Excellent file management and collaboration for public authorities, providers \
and business - or anyone who values ease of use and digital sovereignty. \
 \
This package contains the server component."
LICENSE = "Apache-2.0"

PV = "7.5.0"

RPM_NAME = "opencloud-server-7.5.0-1.1.aarch64.rpm"
RPM_HASH = "3c1ffe5750ecf85edc5ee77843269e70d1852125c089b1bd0d057bba2f463962e8dc40c839d7282b762f6d173247e41da969faabd8c7e58a696dde215a0c4f8f"

RPROVIDES:${PN} += "config-opencloud-server \
group-opencloud-server \
opencloud-server \
user-opencloud-server"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libvips.so.42"

inherit rpm
