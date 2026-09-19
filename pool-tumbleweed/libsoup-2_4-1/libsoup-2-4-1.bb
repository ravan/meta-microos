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

PV = "2.74.3"

RPM_NAME = "libsoup-2_4-1-2.74.3-22.1.aarch64.rpm"
RPM_HASH = "3a6da05dc9b426f28b8026a7154c1df4350dfdb16197f555d4e9c0240f018235cd8f0869284bca6c09f200580034fd9405269c1ea675439f1acfa3ff3985f65f"

RPROVIDES:${PN} += "libsoup-2-4-1 \
libsoup-2.4.so.1 \
libsoup-gnome-2.4.so.1 \
libsoup2"

RDEPENDS:${PN} += "/sbin/ldconfig \
glib-networking \
ld-linux-aarch64.so.1 \
libbrotlidec.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgssapi-krb5.so.2 \
libpsl.so.5 \
libsqlite3.so.0 \
libxml2.so.16 \
libz.so.1"

inherit rpm
