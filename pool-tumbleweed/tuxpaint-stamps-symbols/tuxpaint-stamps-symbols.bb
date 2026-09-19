SUMMARY = "Symbol stamps collection for Tux Paint"
DESCRIPTION = "tuxpaint-stamps-symbols package contains a set of 'Rubber Stamp' images \
which can be used with the 'Stamp' tool within Tux Paint."
LICENSE = "GPL-2.0-or-later"

PV = "2023.07.20"

RPM_NAME = "tuxpaint-stamps-symbols-2023.07.20-1.9.noarch.rpm"
RPM_HASH = "41744f3831cec45c975bdb3ba04ee8868498945381df57bb9525b53d12a12dd528e65478a3e809ca8fba30da5b71ab314383bef838d6afe12f331ffd62d02a79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuxpaint-stamps-category \
tuxpaint-stamps-symbols"

RDEPENDS:${PN} += "tuxpaint-stamps"

inherit rpm
