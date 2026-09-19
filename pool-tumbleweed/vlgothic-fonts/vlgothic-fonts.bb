SUMMARY = "VL-Gothic TrueType font family"
DESCRIPTION = "This package provides 'VLGothic' Japanese TrueType fonts which are \
based on the M+ fonts and the Sazanami fonts."
LICENSE = "BSD-3-Clause & mplus"

PV = "20220612"

RPM_NAME = "vlgothic-fonts-20220612-2.9.noarch.rpm"
RPM_HASH = "fd9a80d3cb74c2f4358138654d527883e8578a48f559ff5522cda8d4685e408f47e4c0e91d2b78aea23574d0e1828ff93f7dd26d9293811715d5d555ae35734b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-ja \
scalable-font-ja \
vlgothic \
vlgothic-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
