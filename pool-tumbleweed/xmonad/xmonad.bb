SUMMARY = "A tiling window manager"
DESCRIPTION = "Xmonad is a tiling window manager for X. Windows are arranged automatically to \
tile the screen without gaps or overlap, maximising screen use. All features of \
the window manager are accessible from the keyboard: a mouse is strictly \
optional. xmonad is written and extensible in Haskell. Custom layout \
algorithms, and other extensions, may be written by the user in config files. \
Layouts are applied dynamically, and different layouts may be used on each \
workspace. Xinerama is fully supported, allowing windows to be tiled on several \
screens."
LICENSE = "BSD-3-Clause"

PV = "0.18.1"

RPM_NAME = "xmonad-0.18.1-1.3.aarch64.rpm"
RPM_HASH = "55c9ff8c6992526c8e089077f8a16d3061f1f8361b228f7b1998dda845aff60845c2f0d3e0e554f2c97bd34df0e622f1b1974131d47a5b9b404f11a2c74416f3"

RPROVIDES:${PN} += "windowmanager \
xmonad"

RDEPENDS:${PN} += "libX11.so.6 \
libXext.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libXss.so.1 \
libc.so.6 \
libffi.so.8 \
libgmp.so.10 \
libm.so.6 \
libnuma.so.1"

inherit rpm
