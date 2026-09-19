SUMMARY = "Noto Serif Traditional Chinese Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Serif font for Traditional Chinese, hinted and variable."
LICENSE = "OFL-1.1"

PV = "2.002"

RPM_NAME = "google-noto-serif-tc-fonts-2.002-1.7.noarch.rpm"
RPM_HASH = "7cc49a1f36a6e845c703e5f052e165ddf1a1a7ee021cc64b1d72d07269b148acfcb58469fe47edb537b8d881cf89aef95c8adeb4935a7bbf90f86ceb5146d379"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-serif-tc-black-fonts \
google-noto-serif-tc-bold-fonts \
google-noto-serif-tc-extralight-fonts \
google-noto-serif-tc-fonts \
google-noto-serif-tc-fonts-full \
google-noto-serif-tc-light-fonts \
google-noto-serif-tc-medium-fonts \
google-noto-serif-tc-regular-fonts \
google-noto-serif-tc-semibold-fonts \
locale-zh-TW \
noto-serif-tc-fonts \
scalable-font-zh-TW"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
