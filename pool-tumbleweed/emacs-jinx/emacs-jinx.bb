SUMMARY = "Enchanted Spell Checker for Emacs"
DESCRIPTION = "Jinx is a fast just-in-time spell-checker for Emacs."
LICENSE = "GPL-3.0-or-later"

PV = "2.10"

RPM_NAME = "emacs-jinx-2.10-1.1.aarch64.rpm"
RPM_HASH = "1629552d61a901e0a1264f4e41d28ac3243a3be529eaf9617faddfb4335c2f0534a91347b6f6f3376c0714ad0a8eba37e1735f7125e9fb77cff0458320887aa8"

RPROVIDES:${PN} += "emacs-jinx"

RDEPENDS:${PN} += "emacs \
emacs-compat \
libc.so.6 \
libenchant-2.so.2"

inherit rpm
