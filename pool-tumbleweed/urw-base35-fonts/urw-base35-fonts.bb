SUMMARY = "Core Font Set containing 35 freely distributable fonts from (URW)++"
DESCRIPTION = "The URW++ Base 35 fonts are a metric compatible substitute for the \
Adobe Postscript(c) Level 2 Base 35 fonts."
LICENSE = "AGPL-3.0-only-with-PS-or-PDF-font-exception-20170817"

PV = "20200910"

RPM_NAME = "urw-base35-fonts-20200910-2.4.noarch.rpm"
RPM_HASH = "95072d10cc20d27e4adbbb33000ac4ca9bb31b2b45ba9e4eb7940961b2809d76a7ff6823d54da2795d6e72a1c7fc4e1ef11372c44f3fbeb29b296fa74fe3c161"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-urw-base35-fonts \
ghostscript-fonts-std-converted \
urw-base35-fonts \
xorg-x11-fonts-converted"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl \
urw-base35-fonts-C059 \
urw-base35-fonts-D050000L \
urw-base35-fonts-NimbusMonoPS \
urw-base35-fonts-NimbusRoman \
urw-base35-fonts-NimbusSans \
urw-base35-fonts-P052 \
urw-base35-fonts-StandardSymbolsPS \
urw-base35-fonts-URWBookman \
urw-base35-fonts-URWGothic \
urw-base35-fonts-Z003"

inherit rpm
