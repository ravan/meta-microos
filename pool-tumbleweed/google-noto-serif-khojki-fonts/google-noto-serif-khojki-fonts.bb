SUMMARY = "Noto Khojki Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Khojki Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-serif-khojki-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "29ea2e2f1ed5cb3bf56e59c01e1a01f4f12531029deb41da518c2a3864bceeaea6d516c93965b199862018d879947ffb5924c8e6e008b31dc0305545fbf739e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-khojki-fonts \
noto-serif-khojki \
noto-serif-khojki-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
