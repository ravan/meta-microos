SUMMARY = "Noto Sans CJK Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible heights \
and stroke thicknesses) across languages. This package Noto Sans fonts for the \
four CJK languages."
LICENSE = "OFL-1.1"

PV = "2.004"

RPM_NAME = "google-noto-sans-cjk-fonts-2.004-7.7.noarch.rpm"
RPM_HASH = "d15183781176c32638c79e4bb7c756f54378fa6780fe61b2177b95081439b24316802fe3f06ee0d56c755097a134c9e37ab68e9aecfd34f0c251f478c514ce51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "google-noto-sans-cjk-fonts \
noto-sans-cjk \
noto-sans-cjk-fonts"

RDEPENDS:${PN} += "google-noto-sans-jp-fonts \
google-noto-sans-kr-fonts \
google-noto-sans-sc-fonts \
google-noto-sans-tc-fonts"

inherit rpm
