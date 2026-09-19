SUMMARY = "Simple PIN or Passphrase Entry Dialog for GNOME"
DESCRIPTION = "A simple PIN or passphrase entry dialog utilize the Assuan protocol \
as described by the Aegypten project, using GNOME libraries."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.3"

RPM_NAME = "pinentry-gnome3-1.3.3-1.1.aarch64.rpm"
RPM_HASH = "426b35c560b13a44b42bcc0a8f6aec4267849aa06d78d74d0feae0d51c30eb5960c8ad23f8a329b1268834bdc3f29a3f6563d599cf39bcec97dac8dbbe3f535c"

RPROVIDES:${PN} += "pinentry-/usr/bin/pinentry-gnome3 \
pinentry-dialog \
pinentry-gnome3 \
pinentry-gui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libassuan.so.9 \
libc.so.6 \
libgcr-base-3.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpg-error.so.0 \
libncursesw.so.6 \
libsecret-1.so.0 \
libtinfo.so.6 \
pinentry"

inherit rpm
