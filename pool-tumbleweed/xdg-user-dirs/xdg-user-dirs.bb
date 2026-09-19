SUMMARY = "Utilities to handle user data directories"
DESCRIPTION = "xdg-user-dirs is a tool to help manage 'well known' user directories \
like the desktop folder and the music folder. It also \
handles localization (i.e. translation) of the filenames."
LICENSE = "GPL-2.0-only"

PV = "0.20"

RPM_NAME = "xdg-user-dirs-0.20-2.1.aarch64.rpm"
RPM_HASH = "55fe50232e1cf1f4869034f824ae900d58b1a16d459f3d4bf86e9407907727331ca0491a43d4ab92e1f9a4d70c0603fdffe75fd53eba671fc583f1b47ebf443e"

RPROVIDES:${PN} += "config-xdg-user-dirs \
xdg-user-dirs"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
