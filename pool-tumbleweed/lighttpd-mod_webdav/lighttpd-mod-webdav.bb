SUMMARY = "WebDAV module for Lighttpd"
DESCRIPTION = "A WebDAV implementation designed to be fast and compliant to RFC 4918."
LICENSE = "BSD-3-Clause"

PV = "1.4.85"

RPM_NAME = "lighttpd-mod_webdav-1.4.85-1.2.aarch64.rpm"
RPM_HASH = "7afd5fa7a703be7c189a87de5e3e4875045c7008eb0b96d642132b49a89a7342a7951fdbc27318f5c833ff205fdf723bf2f8284617f1c4c2adeb08d4463283bf"

RPROVIDES:${PN} += "config-lighttpd-mod-webdav \
lighttpd-mod-webdav"

RDEPENDS:${PN} += "group-lighttpd \
libc.so.6 \
libsqlite3.so.0 \
libxml2.so.16 \
lighttpd"

inherit rpm
