SUMMARY = "Noto Sans Traditional Chinese (Hong Kong) Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains Sans font for \
Traditional Chinese (Hong Kong), hinted and variable."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-hk-fonts-2.004-7.7.noarch.rpm"
RPM_HASH = "3b05c564a2aa58d7024387ca176a5689395a9c558e04c6e530f93eaed05a4c8fc507dad3cc3ea12e51d24e4df7a71a63a8e7b7804365be104da1593a0399c5d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-hk-black-fonts \
google-noto-sans-hk-bold-fonts \
google-noto-sans-hk-demilight-fonts \
google-noto-sans-hk-fonts \
google-noto-sans-hk-fonts-full \
google-noto-sans-hk-light-fonts \
google-noto-sans-hk-medium-fonts \
google-noto-sans-hk-regular-fonts \
google-noto-sans-hk-thin-fonts \
locale-zh-HK;zh-MO \
noto-sans-cjkhk \
noto-sans-cjkhk-fonts \
noto-sans-hk-fonts \
scalable-font-zh-HK \
scalable-font-zh-MO"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
