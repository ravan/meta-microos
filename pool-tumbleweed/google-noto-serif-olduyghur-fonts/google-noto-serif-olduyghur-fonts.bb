SUMMARY = "Noto Old Uyghur Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
OldUyghur Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-serif-olduyghur-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "c1d745c9fa2a4f075b8f51f928aceb2f23bcb8824b5e87365ca209c1b0ea23de39c8db51962315028d99075c118c46983be3c9aa9c656e5c9543b23d67067073"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-olduyghur-fonts \
noto-serif-olduyghur \
noto-serif-olduyghur-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
