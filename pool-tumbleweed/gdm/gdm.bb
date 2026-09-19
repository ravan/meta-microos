SUMMARY = "The GNOME Display Manager"
DESCRIPTION = "The GNOME Display Manager is a system service that is responsible for \
providing graphical log-ins and managing local and remote displays."
LICENSE = "GPL-2.0-or-later"

PV = "50.3"

RPM_NAME = "gdm-50.3-1.1.aarch64.rpm"
RPM_HASH = "bfaefa2ded1b9afbd4e155b8ceceee5c7d22c07aec918786b8dafc27ac3c668b69c9bc3b48d60cc2ae80d6baf8b8a81b3167c20504442dce49826f9c81b6b98e"

RPROVIDES:${PN} += "config-gdm \
gdm \
group-gdm \
user-gdm"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/sh \
dconf \
displaymanager-sysconfig \
gdm-branding \
gnome-session-core \
gnome-settings-daemon \
gnome-shell \
group-video \
gsettings-backend-dconf \
ld-linux-aarch64.so.1 \
libXau.so.6 \
libaccountsservice.so.0 \
libaudit.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgudev-1.0.so.0 \
libjson-glib-1.0.so.0 \
libkeyutils.so.1 \
libpam.so.0 \
libpolkit-gobject-1.so.0 \
libselinux.so.1 \
libsystemd.so.0 \
sysuser-shadow"

inherit rpm
