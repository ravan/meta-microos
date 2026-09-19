SUMMARY = "Noto Serif Traditional Chinese (Hong Kong) Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Serif font for Traditional Chinese (Hong Kong), hinted and variable."
LICENSE = "OFL-1.1"

PV = "2.002"

RPM_NAME = "google-noto-serif-hk-fonts-2.002-1.7.noarch.rpm"
RPM_HASH = "d54a8989c58399fa97a8a1ebd9be00015e3a3235dcde68657203b051102a27d0a1a5c3f56db8ec0f6caf54ba4c77e62babdfc8725305dc74f7d02669c4ab6e62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-hk-black-fonts \
google-noto-serif-hk-bold-fonts \
google-noto-serif-hk-extralight-fonts \
google-noto-serif-hk-fonts \
google-noto-serif-hk-fonts-full \
google-noto-serif-hk-light-fonts \
google-noto-serif-hk-medium-fonts \
google-noto-serif-hk-regular-fonts \
google-noto-serif-hk-semibold-fonts \
locale-zh-HK;zh-MO \
noto-serif-hk-fonts \
scalable-font-zh-HK \
scalable-font-zh-MO"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
