SUMMARY = "C++ port of suckless.org st (simple-terminal) emulator"
DESCRIPTION = "The not (so) simple terminal emulator. It is a C++ port of st, the simple \
terminal emulator for X that sucks less. Apart from a modernized code base \
nst offers builtin scrollback buffer support, enhanced smart selection \
features and the possibility to process the terminal buffer history in \
external tools for searching."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "nst-1.1.4-1.3.aarch64.rpm"
RPM_HASH = "6878095a9f62f46cfa71b78843563e6a6b59d6ba2303c810c3ef749b3776598e2cbd74f769c4f27986dc453a5edbcc990916433cff2d4397e128fd9d62927f2e"

RPROVIDES:${PN} += "nst"

RDEPENDS:${PN} += "libX11.so.6 \
libXft.so.2 \
libc.so.6 \
libcosmos.so.4 \
libfontconfig.so.1 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxpp.so.3"

inherit rpm
