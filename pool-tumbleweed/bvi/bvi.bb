SUMMARY = "Editor for binary files"
DESCRIPTION = "The bvi is a display-oriented editor for binary files, based on the vi \
texteditor. If you are familiar with vi, just start the editor and begin to \
edit! A bmore program is also included in the package.  If you never heard \
about vi, maybe bvi is not the best choice for you."
LICENSE = "GPL-2.0-or-later"

PV = "1.5.0"

RPM_NAME = "bvi-1.5.0-1.5.aarch64.rpm"
RPM_HASH = "ad78a8902b3f52a6a070d333e5bc681a9827426f51297ec5e12c4f445e579760f7858153669a407383a92f2a4dbbd5e2594258e6e5da98dccb36cdb94e6d2689"

RPROVIDES:${PN} += "bvi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncurses.so.6 \
libtinfo.so.6"

inherit rpm
