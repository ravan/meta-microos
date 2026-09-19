SUMMARY = "HTTP client/server library for GNOME - Development Files"
DESCRIPTION = "Libsoup is an HTTP client/server library for GNOME. It uses GObjects \
and the glib main loop, to integrate well with GNOME applications. \
 \
Features: \
  * Both asynchronous (GMainLoop and callback-based) and synchronous APIs \
  * Automatically caches connections \
  * SSL Support using GnuTLS \
  * Proxy support, including authentication and SSL tunneling \
  * Client support for Digest, NTLM, and Basic authentication \
  * Server support for Digest and Basic authentication \
  * XML-RPC support"
LICENSE = "LGPL-2.1-or-later"

PV = "3.6.6"

RPM_NAME = "libsoup-devel-3.6.6-8.1.aarch64.rpm"
RPM_HASH = "439b7932bb0c288ae4f20cae5a7b8f5e20bc57d5ce99f3dd067e9861927113eb04f03afa0cd259b583e839c36b71a62e95e00d87238abbfc86cb6a8d66fcbf9f"

RPROVIDES:${PN} += "libsoup-devel \
libsoup-doc \
pkgconfig-libsoup-3.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsoup-3-0-0 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-no-export-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-krb5-gssapi \
pkgconfig-libbrotlidec \
pkgconfig-libnghttp2 \
pkgconfig-libpsl \
pkgconfig-sqlite3 \
pkgconfig-zlib \
typelib-1-0-Soup-3-0"

inherit rpm
