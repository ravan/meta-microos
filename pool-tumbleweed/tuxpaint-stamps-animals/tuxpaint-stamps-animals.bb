SUMMARY = "Animals stamps stamps collection for Tux Paint"
DESCRIPTION = "tuxpaint-stamps-animals package contains a set of 'Rubber Stamp' images \
which can be used with the 'Stamp' tool within Tux Paint."
LICENSE = "GPL-2.0-or-later"

PV = "2023.07.20"

RPM_NAME = "tuxpaint-stamps-animals-2023.07.20-1.9.noarch.rpm"
RPM_HASH = "ef1f5325aa1d46b579ad71e57a7ba9b8f29090bf927ddf812a65e8006f9d582c764adaaccfeaf17862facf5255a7a80440ddddd6e537d1574fa19a44962fe00e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuxpaint-stamps-animals \
tuxpaint-stamps-category"

RDEPENDS:${PN} += "tuxpaint-stamps"

inherit rpm
