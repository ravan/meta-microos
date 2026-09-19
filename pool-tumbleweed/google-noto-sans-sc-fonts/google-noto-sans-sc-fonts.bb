SUMMARY = "Noto Sans Simplified Chinese Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package contains Sans font for \
Simplified Chinese, hinted and variable."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-sc-fonts-2.004-7.7.noarch.rpm"
RPM_HASH = "f113e1f6eae61570e470d08178ef5c94e935c477c65af35907d9da0a41920ee8570ae5fe8d0b1ef972d1f157b15878c042b7b7c12819cfa636562ba86d2c08e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-sc-black-fonts \
google-noto-sans-sc-bold-fonts \
google-noto-sans-sc-demilight-fonts \
google-noto-sans-sc-fonts \
google-noto-sans-sc-fonts-full \
google-noto-sans-sc-light-fonts \
google-noto-sans-sc-medium-fonts \
google-noto-sans-sc-regular-fonts \
google-noto-sans-sc-thin-fonts \
locale-zh-CN;zh-SG \
noto-sans-cjksc \
noto-sans-cjksc-fonts \
noto-sans-sc-fonts \
scalable-font-zh-CN \
scalable-font-zh-SG"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
