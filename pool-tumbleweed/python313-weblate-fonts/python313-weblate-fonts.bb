SUMMARY = "Weblate fonts collection"
DESCRIPTION = "Fonts used in Weblate. \
 \
Sources are available at <https://github.com/WeblateOrg/fonts>."
LICENSE = "CC0-1.0 & OFL-1.1"

PV = "2026.1"

RPM_NAME = "python313-weblate-fonts-2026.1-1.5.noarch.rpm"
RPM_HASH = "8f60b98d8b7e2c4ed4ad9f5b4fed1105ecd06e781058bc0963948b2282f7e6eaad2b1210228630d08d85115999f6ab26957249bb05b975f88edc346b0ad3e59c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-weblate-fonts \
python3.13dist-weblate-fonts \
python313-weblate-fonts \
python3dist-weblate-fonts"

RDEPENDS:${PN} += "python-abi"

inherit rpm
