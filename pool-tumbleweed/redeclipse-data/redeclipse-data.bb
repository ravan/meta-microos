SUMMARY = "Data files for the Red Eclipse game"
DESCRIPTION = "This package contains the data files (maps, models, textures, sounds, etc.) for the Red Eclipse game."
LICENSE = "CC-BY-SA-3.0 & Zlib"

PV = "2.0.0"

RPM_NAME = "redeclipse-data-2.0.0-5.1.noarch.rpm"
RPM_HASH = "a1aa2da0af5f4264759784acba90004b7ac3f142f630d15cd9f7a2e324268507255c68d5a734df0290a7e14e02ac6ea44bc7cd61aed36da3456ed589c833b5ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "redeclipse-data"

RDEPENDS:${PN} += ""

inherit rpm
