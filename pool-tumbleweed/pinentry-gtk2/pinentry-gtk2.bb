SUMMARY = "Simple PIN or Passphrase Entry Dialog for GTK2"
DESCRIPTION = "A simple PIN or passphrase entry dialog utilize the Assuan protocol \
as described by the Aegypten project, using the GTK2 UI toolkit."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.3"

RPM_NAME = "pinentry-gtk2-1.3.3-1.1.aarch64.rpm"
RPM_HASH = "c6977cfa0539170b46e5d5421e40bef9a939ee81bc7da27cec12953ac85f74957094f9897e35bd61362e899a6bf1a2e625383baae6b7de58d6874dcfd4297507"

RPROVIDES:${PN} += "pinentry-/usr/bin/pinentry-gtk-2 \
pinentry-dialog \
pinentry-gtk2 \
pinentry-gui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libassuan.so.9 \
libc.so.6 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgpg-error.so.0 \
libgtk-x11-2.0.so.0 \
libncursesw.so.6 \
libsecret-1.so.0 \
libtinfo.so.6 \
pinentry"

inherit rpm
