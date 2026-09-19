SUMMARY = "Device firmware updater daemon"
DESCRIPTION = "fwupd is a daemon to allows session software to update device firmware on \
the local machine. \
 \
You can either use a GUI software manager like GNOME Software to view and apply \
updates, the command line tool or the system D-Bus interface directly."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.1.7"

RPM_NAME = "fwupd-2.1.7-2.1.aarch64.rpm"
RPM_HASH = "22eeb5516dd6dc54bbb219ca164bb98e641b613a87da88f8bf4aacd33cd1986348bedfc9a9774598b9f8f3c917edaddccd2b3469f92069d42660dfd2e8eefef1"

RPROVIDES:${PN} += "config-fwupd \
dbxtool \
fwupd \
libfu-plugin-modem-manager.so \
libfwupdengine.so \
libfwupdplugin.so \
libfwupdutil.so"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
fwupd-efi \
ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libcurl.so.4 \
libdrm-amdgpu.so.1 \
libdrm.so.2 \
libfwupd.so.3 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgnutls.so.30 \
libgobject-2.0.so.0 \
liblzma.so.5 \
libmbim-glib.so.4 \
libmm-glib.so.0 \
libmnl.so.0 \
libpolkit-gobject-1.so.0 \
libqmi-glib.so.5 \
libreadline.so.8 \
libsqlite3.so.0 \
libsystemd.so.0 \
libusb-1.0.so.0 \
libxmlb.so.2 \
libz.so.1 \
shim \
typelib-Fwupd \
typelib-GLib \
udisks2"

inherit rpm
