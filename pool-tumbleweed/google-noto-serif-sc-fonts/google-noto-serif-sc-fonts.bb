SUMMARY = "Noto Serif Simplified Chinese Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Serif font for Simplified Chinese, hinted and variable."
LICENSE = "OFL-1.1"

PV = "2.002"

RPM_NAME = "google-noto-serif-sc-fonts-2.002-1.7.noarch.rpm"
RPM_HASH = "9b895be09a8eb2d15286f665150b50c267c9d5073f86de57be67c58e78c347e5a5a58d5bbdd64af1e9f6505a9b4643430d99da6c0941766815e34a1e1324de32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-sc-black-fonts \
google-noto-serif-sc-bold-fonts \
google-noto-serif-sc-extralight-fonts \
google-noto-serif-sc-fonts \
google-noto-serif-sc-fonts-full \
google-noto-serif-sc-light-fonts \
google-noto-serif-sc-medium-fonts \
google-noto-serif-sc-regular-fonts \
google-noto-serif-sc-semibold-fonts \
locale-zh-CN;zh-SG \
noto-serif-sc-fonts \
scalable-font-zh-CN \
scalable-font-zh-SG"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
