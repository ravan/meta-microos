SUMMARY = "Space stamps collection for Tux Paint"
DESCRIPTION = "tuxpaint-stamps-space package contains a set of 'Rubber Stamp' images \
which can be used with the 'Stamp' tool within Tux Paint."
LICENSE = "GPL-2.0-or-later"

PV = "2023.07.20"

RPM_NAME = "tuxpaint-stamps-space-2023.07.20-1.9.noarch.rpm"
RPM_HASH = "adfea391f82f73a0ffa25dfebe4c5d6a7bbab7a015b132cccb4b33d60cb7ca29464742e232010c6ccdf8c744f04266c84c527459b3caaaf5bd941b1b7da634b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tuxpaint-stamps-category \
tuxpaint-stamps-space"

RDEPENDS:${PN} += "tuxpaint-stamps"

inherit rpm
