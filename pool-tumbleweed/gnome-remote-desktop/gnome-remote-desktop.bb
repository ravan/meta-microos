SUMMARY = "GNOME Remote Desktop screen sharing service"
DESCRIPTION = "GNOME Remote Desktop is a remote desktop and screen sharing service for the \
GNOME desktop environment."
LICENSE = "GPL-2.0-or-later"

PV = "50.2"

RPM_NAME = "gnome-remote-desktop-50.2-1.1.aarch64.rpm"
RPM_HASH = "bc075f6bff66d4350ca7f117e5fb5d3f0d474f50919a68bc5893e75d59c3189e98c3a6f5ba3d0b9ce6365bd3797ec3e512d0f4be35ee2bf70310bcc6681f39fe"

RPROVIDES:${PN} += "gnome-remote-desktop \
group-gnome-remote-desktop \
user-gnome-remote-desktop"

RDEPENDS:${PN} += "/usr/bin/sh \
fuse3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libdrm.so.2 \
libei.so.1 \
libepoxy.so.0 \
libfdk-aac.so.2 \
libfreerdp-server3.so.3 \
libfreerdp3.so.3 \
libfuse3.so.4 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libkrb5.so.3 \
libnotify.so.4 \
libopus.so.0 \
libpipewire-0.3.so.0 \
libpolkit-gobject-1.so.0 \
libsecret-1.so.0 \
libsystemd.so.0 \
libtss2-esys.so.0 \
libtss2-mu.so.0 \
libtss2-rc.so.0 \
libtss2-tctildr.so.0 \
libva-drm.so.2 \
libva.so.2 \
libvncserver.so.1 \
libvulkan.so.1 \
libwinpr3.so.3 \
libxkbcommon.so.0 \
pipewire \
sysuser-shadow"

inherit rpm
