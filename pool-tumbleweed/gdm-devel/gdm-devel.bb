SUMMARY = "Libraries for GDM -- Development Files"
DESCRIPTION = "The GNOME Display Manager is a system service that is responsible for \
providing graphical log-ins and managing local and remote displays."
LICENSE = "GPL-2.0-or-later"

PV = "50.3"

RPM_NAME = "gdm-devel-50.3-1.1.aarch64.rpm"
RPM_HASH = "39754f8d136bea7e064374ff79b9cc1b264960bd1b703b03596e579fc5ae506d47f94469a88e01b819d270e7d70cba99303dbf41eb447ab3c508ac086f315c10"

RPROVIDES:${PN} += "gdm-devel \
pkgconfig-gdm \
pkgconfig-gdm-pam-extensions"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgdm1 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libselinux \
pkgconfig-libsystemd \
typelib-1-0-Gdm-1-0"

inherit rpm
