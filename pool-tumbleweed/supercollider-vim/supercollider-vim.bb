SUMMARY = "SuperCollider support for Vim"
DESCRIPTION = "SuperCollider support for the Vim text editor."
LICENSE = "GPL-3.0-only"

PV = "3.14.1"

RPM_NAME = "supercollider-vim-3.14.1-1.5.noarch.rpm"
RPM_HASH = "9208f076b08c5d8f9a2fa3a199b097439d660849d84095217d45c7a14702bc5be0faf5941404a0cfb292388fd4d4cb4d98e9414ea7b0cceb9dd14a61981c4389"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "supercollider-vim"

RDEPENDS:${PN} += "supercollider"

inherit rpm
