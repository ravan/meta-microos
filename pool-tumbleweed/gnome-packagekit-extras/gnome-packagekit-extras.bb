SUMMARY = "Extra applications for the PackageKit API"
DESCRIPTION = "GNOME PackageKit provides session applications for the PackageKit API. \
There are several utilities designed for installing, updating and \
removing packages on your system. \
 \
This package contains tools that provide functionality also provided by \
YaST Software Management."
LICENSE = "GPL-2.0-or-later"

PV = "43.0"

RPM_NAME = "gnome-packagekit-extras-43.0-2.5.aarch64.rpm"
RPM_HASH = "249bf1ae95a2f3f49027675cde6dc0446b55a97d6a0d33589760be6ddb9ab25876ffc5120e8548f0fd3d797f5d1d88bb4b1487a31bf5fd71a7783d41348671f4"

RPROVIDES:${PN} += "gnome-packagekit-extras"

RDEPENDS:${PN} += "gnome-packagekit \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpackagekit-glib2.so.18"

inherit rpm
