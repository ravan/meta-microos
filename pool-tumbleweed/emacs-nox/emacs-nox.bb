SUMMARY = "GNU Emacs-nox: An Emacs Binary without X Window System Support"
DESCRIPTION = "Eight Megabytes And Constantly Swapping. Call it \
 \
emacs-nox \
 \
Love it or leave it."
LICENSE = "GPL-3.0-or-later"

PV = "31.1"

RPM_NAME = "emacs-nox-31.1-3.1.aarch64.rpm"
RPM_HASH = "892e909e9d7d21a858adf70f36427f4c8105e48adb8d6b8fe468d47ab8c2e68c9e616ddd31f01c75027e7d36641baf13af8b25ca0cc5517c63a0b1eecd4505aa"

RPROVIDES:${PN} += "emacs-nox \
emacs-program"

RDEPENDS:${PN} += "emacs \
emacs-eln \
fileutils \
ld-linux-aarch64.so.1 \
libacl.so.1 \
libc.so.6 \
libgccjit.so.0 \
libgmp.so.10 \
libgnutls.so.30 \
libgpm.so.2 \
liblcms2.so.2 \
libm.so.6 \
libsqlite3.so.0 \
libsystemd.so.0 \
libtinfo.so.6 \
libtree-sitter.so.0.26 \
libxml2.so.16 \
libz.so.1"

inherit rpm
