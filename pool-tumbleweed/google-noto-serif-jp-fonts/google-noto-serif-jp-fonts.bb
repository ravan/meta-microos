SUMMARY = "Noto Serif Japanese Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Serif font for Japanese, hinted and variable."
LICENSE = "OFL-1.1"

PV = "2.002"

RPM_NAME = "google-noto-serif-jp-fonts-2.002-1.7.noarch.rpm"
RPM_HASH = "8ae07609e5a2971c671483ec591a776996f753bec88d03b3b828c9f76049be504daed76212df3504606d5e7dbbae3056a234cc0efa10f133fa27d13417e95044"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-jp-black-fonts \
google-noto-serif-jp-bold-fonts \
google-noto-serif-jp-extralight-fonts \
google-noto-serif-jp-fonts \
google-noto-serif-jp-fonts-full \
google-noto-serif-jp-light-fonts \
google-noto-serif-jp-medium-fonts \
google-noto-serif-jp-regular-fonts \
google-noto-serif-jp-semibold-fonts \
locale-ja \
noto-serif-jp-fonts \
scalable-font-ja"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
