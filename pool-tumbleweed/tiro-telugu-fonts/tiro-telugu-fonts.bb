SUMMARY = "Tiro Telugu Fonts"
DESCRIPTION = "Tiro Telugu has its origins in a typeface designed for the \
Murty Classical Library of India book series, so is especially suited to \
traditional literary publishing but also made with the needs of today’s \
multiple print and screen media in mind."
LICENSE = "OFL-1.1"

PV = "1.52"

RPM_NAME = "tiro-telugu-fonts-1.52-2.7.noarch.rpm"
RPM_HASH = "f6d303c874cd773786af8676cc27774963b1ab00946d5c1290e9f0a804e17f92c89916580cb2c8f0b180326d9c46d129be67fd383461b10edb71a97988d3b7eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tiro-telugu-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
