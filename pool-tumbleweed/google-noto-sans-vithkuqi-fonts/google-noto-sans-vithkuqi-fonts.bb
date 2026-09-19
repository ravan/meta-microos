SUMMARY = "Noto Vithkuqi Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Vithkuqi Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20260901"

RPM_NAME = "google-noto-sans-vithkuqi-fonts-20260901-1.1.noarch.rpm"
RPM_HASH = "b67915afe5dd9d05db9ffe8a58dac54181f52dbf14a63f439c5f0880434d877bb3e48fa457bb45c97ef0a11b3e2a1686fc2a6697c78e038fd224c2ed68bc7531"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-vithkuqi-fonts \
noto-sans-vithkuqi \
noto-sans-vithkuqi-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
