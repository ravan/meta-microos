SUMMARY = "A Program to Generate Tag Files for Use with vi and Other Editors"
DESCRIPTION = "CTags (from Darren Hiebert) generates tag files from source code in C, \
C++, Eiffel, Fortran, and Java to be used with vi and its derivatives, \
Emacs, and several other editors."
LICENSE = "GPL-2.0-or-later"

PV = "5.8"

RPM_NAME = "ctags-5.8-15.5.aarch64.rpm"
RPM_HASH = "d782f113ebd641dd0c800e295c63a429daa1de80258c7daa07807961e04fd3454b3b17435bee6e0ca42e41ec041cbad1c128c6624d822cf710336126932f06b9"

RPROVIDES:${PN} += "arduino-ctags \
ctags"

RDEPENDS:${PN} += "alts \
coreutils \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
