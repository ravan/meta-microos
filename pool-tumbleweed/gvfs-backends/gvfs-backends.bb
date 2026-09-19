SUMMARY = "VFS functionality for GLib"
DESCRIPTION = "VFS functionality for GLib. \
This package contains all necessary backend files and libraries."
LICENSE = "GPL-3.0-only & LGPL-2.0-or-later"

PV = "1.60.3"

RPM_NAME = "gvfs-backends-1.60.3-1.1.aarch64.rpm"
RPM_HASH = "2a289804eb50aebf4a845749f110f10217565849dc07b56c5e36307f09f329054c2e07761cb2e221f73d52c05166ec8a1e525754ba5f490608836f6970f435c5"

RPROVIDES:${PN} += "gvfs-backends"

RDEPENDS:${PN} += "/usr/bin/sh \
gvfs \
ld-linux-aarch64.so.1 \
libarchive.so.13 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libavahi-glib.so.1 \
libbluray.so.3 \
libc.so.6 \
libgcrypt.so.20 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgudev-1.0.so.0 \
libgvfscommon.so \
libgvfsdaemon.so \
libmtp.so.9 \
libnfs.so.16 \
libpolkit-gobject-1.so.0 \
libsecret-1.so.0 \
libsoup-3.0.so.0 \
libsystemd.so.0 \
libudisks2.so.0 \
libusb-1.0.so.0 \
libxml2.so.16 \
permissions"

inherit rpm
