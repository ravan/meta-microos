SUMMARY = "Hobbies stamps collection for Tux Paint"
DESCRIPTION = "tuxpaint-stamps-hobbies package contains a set of 'Rubber Stamp' images \
which can be used with the 'Stamp' tool within Tux Paint."
LICENSE = "GPL-2.0-or-later"

PV = "2023.07.20"

RPM_NAME = "tuxpaint-stamps-hobbies-2023.07.20-1.9.noarch.rpm"
RPM_HASH = "e2856fa4e1435a9ef2b2852635635459b8eac2e0fd8211927c8bff47a3ccd1edea65c387a7a96bd788279e676a9d5c2ddc74f4911e95a7820ed9687c4ef7cc17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuxpaint-stamps-category \
tuxpaint-stamps-hobbies"

RDEPENDS:${PN} += "tuxpaint-stamps"

inherit rpm
