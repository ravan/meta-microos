SUMMARY = "An experimental module for libgit2 bindings to Emacs"
DESCRIPTION = "This is an experimental module for libgit2 bindings to Emacs, intended to boost the performance of magit."
LICENSE = "GPL-2.0-or-later"

PV = "471.373defa"

RPM_NAME = "emacs-libgit2-471.373defa-2.10.aarch64.rpm"
RPM_HASH = "9dd9d3ae33fc1d23eec9b76cacadd7caa22ba27c03d49726d445bab6f451eeb241ac4c7b738f4cf24f7a44cc7bca7689819011f01a88fda3a6a8ac6248c9ad6c"

RPROVIDES:${PN} += "emacs-libgit2 \
libegit2.so"

RDEPENDS:${PN} += "emacs \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgit2.so.1.9"

inherit rpm
