SUMMARY = "Common data for eog-plugins"
DESCRIPTION = "Common data required by all Eye of Gnome plugins"
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "eog-plugins-data-44.1-2.3.noarch.rpm"
RPM_HASH = "d547b7c57c1827d900c323229936c4b71e203bdb585f8ff3d21d80b428aee1d76d3995054b35b31ba24477f4940aa27edd9f656c622b48d8a85bf5d6cea597bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eog-plugins-data"

RDEPENDS:${PN} += "eog"

inherit rpm
