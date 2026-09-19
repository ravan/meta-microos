SUMMARY = "A window manager for X based on Blackbox 0.61.1"
DESCRIPTION = "Fluxbox is a stacking windowmanager for the X Window System which \
started as a fork of Blackbox 0.61.1 in 2001. Its user interface has \
only a taskbar, a pop-up menu accessible by right-clicking on the \
desktop, and minimal support for graphical icons. All basic \
configurations are controlled by text files, including the \
construction of menus and the mapping of key-bindings. Fluxbox \
supports the Extended Window Manager Hints specification."
LICENSE = "MIT"

PV = "1.3.7"

RPM_NAME = "fluxbox-1.3.7-2.10.aarch64.rpm"
RPM_HASH = "2c84bac9bbab0a477ef24c7f71dda98269a683af581c6b4fa61a00ca8aca4847307c87e085383753b10cef53865f091019eaf9e871a2da70be4f38eb3920d424"

RPROVIDES:${PN} += "fluxbox \
windowmanager"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libImlib2.so.1 \
libX11.so.6 \
libXext.so.6 \
libXft.so.2 \
libXinerama.so.1 \
libXpm.so.4 \
libXrandr.so.2 \
libXrender.so.1 \
libc.so.6 \
libfontconfig.so.1 \
libfribidi.so.0 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
