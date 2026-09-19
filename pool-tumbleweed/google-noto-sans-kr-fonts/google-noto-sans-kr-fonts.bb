SUMMARY = "Noto Sans Korean Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains Sans font for \
Korean, hinted and variable."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-kr-fonts-2.004-7.7.noarch.rpm"
RPM_HASH = "a0e55e2a56260d288a43438604533aff07887c4e40a6ede6ab35b33c35a104bd15727f708a3592c314a87f5cf724f9f125c3a54721aac27c24d876320f045ba9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-kr-black-fonts \
google-noto-sans-kr-bold-fonts \
google-noto-sans-kr-demilight-fonts \
google-noto-sans-kr-fonts \
google-noto-sans-kr-fonts-full \
google-noto-sans-kr-light-fonts \
google-noto-sans-kr-medium-fonts \
google-noto-sans-kr-regular-fonts \
google-noto-sans-kr-thin-fonts \
locale-ko \
noto-sans-cjkkr \
noto-sans-cjkkr-fonts \
noto-sans-kr-fonts \
scalable-font-ko"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
