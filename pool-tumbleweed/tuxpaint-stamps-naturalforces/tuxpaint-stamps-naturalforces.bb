SUMMARY = "Natural forces stamps collection for Tux Paint"
DESCRIPTION = "tuxpaint-stamps-naturalforces package contains a set of 'Rubber Stamp' \
images which can be used with the 'Stamp' tool within Tux Paint."
LICENSE = "GPL-2.0-or-later"

PV = "2023.07.20"

RPM_NAME = "tuxpaint-stamps-naturalforces-2023.07.20-1.9.noarch.rpm"
RPM_HASH = "2f80de467f3fb8b55324fc50f1fc26af97ca042b8a71515b24d18b1bc8ae51e900dbca8035550a40e0d275043c6e8086a993876aaaffe9799cf5b2d918e8acf7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuxpaint-stamps-category \
tuxpaint-stamps-naturalforces"

RDEPENDS:${PN} += "tuxpaint-stamps"

inherit rpm
