SUMMARY = "Applications for the PackageKit API"
DESCRIPTION = "GNOME PackageKit provides session applications for the PackageKit API. \
There are several utilities designed for installing, updating and \
removing packages on your system."
LICENSE = "GPL-2.0-or-later"

PV = "43.0"

RPM_NAME = "gnome-packagekit-43.0-2.5.aarch64.rpm"
RPM_HASH = "ca13ca685c638fb5fc964be6eda6d06b8fcef6d5ac935d173bee11944a5996ce2fa7e9aa55b9568ee7f8b66ba5ef37abf10a0ba9b5deb899e633a8ce863cc4f6"

RPROVIDES:${PN} += "gnome-packagekit \
opensuse-updater-gnome \
org.freedesktop.PackageKit.service"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpackagekit-glib2.so.18 \
libpolkit-gobject-1.so.0"

inherit rpm
