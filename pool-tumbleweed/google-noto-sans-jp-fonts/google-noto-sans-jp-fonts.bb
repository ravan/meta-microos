SUMMARY = "Noto Sans Japanese Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains Sans font for \
Japanese, hinted and variable."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-jp-fonts-2.004-7.7.noarch.rpm"
RPM_HASH = "82a4f4370f46e7e6573b4cc8a4972de1349755b9eb80340d1db75aa740ec575c33029d4fb5233d065481d6554322a27a234182dd62c5e6ba3a589ef431f15021"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-jp-black-fonts \
google-noto-sans-jp-bold-fonts \
google-noto-sans-jp-demilight-fonts \
google-noto-sans-jp-fonts \
google-noto-sans-jp-fonts-full \
google-noto-sans-jp-light-fonts \
google-noto-sans-jp-medium-fonts \
google-noto-sans-jp-regular-fonts \
google-noto-sans-jp-thin-fonts \
locale-ja \
noto-sans-cjkjp \
noto-sans-cjkjp-fonts \
noto-sans-jp-fonts \
scalable-font-ja"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
