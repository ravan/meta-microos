SUMMARY = "Noto Serif Korean Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Serif font for Korean, hinted and variable."
LICENSE = "OFL-1.1"

PV = "2.002"

RPM_NAME = "google-noto-serif-kr-fonts-2.002-1.7.noarch.rpm"
RPM_HASH = "7bfab1a85a1066c4a84100ea63d2e5c072c70793c7698c28674320d43ea10ba59560fcb63ebd3d7ef27eae3dcae0d1e49671b798e05af0ff43196fdfbb99ea5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-kr-black-fonts \
google-noto-serif-kr-bold-fonts \
google-noto-serif-kr-extralight-fonts \
google-noto-serif-kr-fonts \
google-noto-serif-kr-fonts-full \
google-noto-serif-kr-light-fonts \
google-noto-serif-kr-medium-fonts \
google-noto-serif-kr-regular-fonts \
google-noto-serif-kr-semibold-fonts \
locale-ko \
noto-serif-kr-fonts \
scalable-font-ko"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
