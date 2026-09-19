SUMMARY = "An Emacs Library for MIME"
DESCRIPTION = "For coding and decoding MIME messages."
LICENSE = "GPL-2.0-or-later"

PV = "1.14.9+136+g2cf5a78"

RPM_NAME = "emacs-flim-1.14.9+136+g2cf5a78-3.7.noarch.rpm"
RPM_HASH = "be6ae874477a6bdefb63c4d68f371bf6be5fb57468f9fb53df5a0993d7d6ce58e85c186a8915ca079a6d0191f9ee04c72fd11768cbf2a3ae890a7526e94f6a27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "emacs-flim \
flim"

RDEPENDS:${PN} += "emacs \
emacs-apel \
emacs-program"

inherit rpm
