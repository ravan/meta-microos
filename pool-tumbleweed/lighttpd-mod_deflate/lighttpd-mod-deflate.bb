SUMMARY = "Compression module for lighttpd"
DESCRIPTION = "Compression module for lighttpd."
LICENSE = "BSD-3-Clause"

PV = "1.4.85"

RPM_NAME = "lighttpd-mod_deflate-1.4.85-1.2.aarch64.rpm"
RPM_HASH = "0eec27f570a22e679220aca692bfde62f1c561a470f5f84030419ec44a8953bbdd3fa3810747c1a9e082847000180e8912d762bc1caa8949cb74dba4f4036fa6"

RPROVIDES:${PN} += "config-lighttpd-mod-deflate \
lighttpd-/etc/lighttpd/conf.d/deflate.conf \
lighttpd-/usr/lib64/lighttpd/mod-deflate.so \
lighttpd-mod-deflate"

RDEPENDS:${PN} += "group-lighttpd \
libbrotlienc.so.1 \
libc.so.6 \
libz.so.1 \
libzstd.so.1 \
lighttpd"

inherit rpm
