SUMMARY = "Repodata downloading library"
DESCRIPTION = "A library providing C and Python (libcURL like) API for downloading repository \
metadata."
LICENSE = "LGPL-2.1-or-later"

PV = "1.20.0"

RPM_NAME = "librepo0-1.20.0-3.1.aarch64.rpm"
RPM_HASH = "4c7288fe7e7463eda7c602d4dce42692d38efe6efbf0e94cea67cba18b51d9f0d27547fe08bd74f22c54a390813251b32974d9c13d9b2982a97a9db1c48c8c94"

RPROVIDES:${PN} += "librepo.so.0 \
librepo0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcurl.so.4 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpgme.so.45 \
libselinux.so.1 \
libxml2.so.16 \
libzck.so.1"

inherit rpm
