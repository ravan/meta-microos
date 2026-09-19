SUMMARY = "An experimental module for libvterm bindings to Emacs"
DESCRIPTION = "Emacs-libvterm (vterm) is fully-fledged terminal emulator inside GNU Emacs based on libvterm, a C library. As a result of using compiled code (instead of elisp), emacs-libvterm is fully capable, fast, and it can seamlessly handle large outputs."
LICENSE = "GPL-3.0-or-later"

PV = "724.7092111"

RPM_NAME = "emacs-vterm-724.7092111-1.1.aarch64.rpm"
RPM_HASH = "889a10229e94d8cf1d3a7d1f8865e2c7d1c17df541846035629d39699f87a8469d4958a120b416840b954b46738a7165fcc439704d06ac7dbddce5981833cb7d"

RPROVIDES:${PN} += "emacs-vterm"

RDEPENDS:${PN} += "emacs \
ld-linux-aarch64.so.1 \
libc.so.6 \
libvterm.so.0"

inherit rpm
