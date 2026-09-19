SUMMARY = "GTK3 Preview Helper for the GTK Configuration"
DESCRIPTION = "This package contains a helper application that allows previewing \
the GTK3 application style from within the application style KCM"
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "6.7.5"

RPM_NAME = "kde-gtk-config6-gtk3-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "efdaf6b9c628e817a56f2558b664a306a665e863e20d4970bc25e4b3c8c0a0f8179220eaa4602d6bbc99de9f9fbc77557541f626611ab40113cbd0556db6de14"

RPROVIDES:${PN} += "kde-gtk-config5-gtk3 \
kde-gtk-config6-gtk3"

RDEPENDS:${PN} += "kde-gtk-config6 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0"

inherit rpm
