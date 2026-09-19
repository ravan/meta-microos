SUMMARY = "Open soundtracks for openRCT2"
DESCRIPTION = "High quality soundtrack as replacement for, and addition to RollerCoaster Tycoon 2's \
soundtrack."
LICENSE = "CC-BY-4.0"

PV = "1.6.1"

RPM_NAME = "openrct2-openmusic-1.6.1-27.1.noarch.rpm"
RPM_HASH = "b6162b6e49a0e767ac7d7f6f2461ebbc766a640b9c6d8cd60db2f00fa427a2bfbb89ae9506ef28fe1fd5d6aa586e8853365080aaa5bd34e593d4647c126a33ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openrct2-openmusic"

RDEPENDS:${PN} += "openrct2"

inherit rpm
