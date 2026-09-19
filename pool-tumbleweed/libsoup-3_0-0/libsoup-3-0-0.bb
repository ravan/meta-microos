SUMMARY = "HTTP client/server library for GNOME"
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

RPM_NAME = "libsoup-3_0-0-3.6.6-8.1.aarch64.rpm"
RPM_HASH = "839464cdd876ab6f0ed905332bc9637c0b4d7045ee7738cd95e3dcf6f07ed82a7ff507f1685804b848b0df0b928eafaa745afd76fce849676ebc1cce7e351ab2"

RPROVIDES:${PN} += "libsoup \
libsoup-3-0-0 \
libsoup-3.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
glib-networking \
ld-linux-aarch64.so.1 \
libbrotlidec.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgssapi-krb5.so.2 \
libnghttp2.so.14 \
libpsl.so.5 \
libsqlite3.so.0 \
libz.so.1"

inherit rpm
