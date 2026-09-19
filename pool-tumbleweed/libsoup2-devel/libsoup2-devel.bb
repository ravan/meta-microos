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

PV = "2.74.3"

RPM_NAME = "libsoup2-devel-2.74.3-22.1.aarch64.rpm"
RPM_HASH = "28df45f14faff5a74a65e90aa40b643dd0cdb1c30de991691210e07dc99c109a1bb3d0b352f5829981df02dff57fdf012b70364adfbbfb9261d1d7a6fcc893bf"

RPROVIDES:${PN} += "libsoup-doc \
libsoup2-devel \
pkgconfig-libsoup-2.4 \
pkgconfig-libsoup-gnome-2.4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsoup-2-4-1 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libbrotlidec \
pkgconfig-libpsl \
pkgconfig-libsoup-2.4 \
pkgconfig-libxml-2.0 \
pkgconfig-sqlite3 \
pkgconfig-zlib \
typelib-1-0-Soup-2-4"

inherit rpm
