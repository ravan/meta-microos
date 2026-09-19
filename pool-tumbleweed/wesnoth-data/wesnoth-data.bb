SUMMARY = "Architecture independent data for Battle for Wesnoth"
DESCRIPTION = "This package contains the game data for Battle For Wesnoth. \
It is required to play the game."
LICENSE = "EPL-1.0 & GPL-2.0-or-later"

PV = "1.18.8"

RPM_NAME = "wesnoth-data-1.18.8-1.1.noarch.rpm"
RPM_HASH = "a737faa387c9ac51808544ec23336245b1ee54a304580c03093fe0a9d7d0e6db9f99223b022ea780088d292c322c3e62c291a3a3e43055643b47cab9d2df1a18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "wesnoth-data"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3 \
wesnoth-fslayout"

inherit rpm
