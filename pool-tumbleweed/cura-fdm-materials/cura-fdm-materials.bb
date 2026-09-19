SUMMARY = "FDM material database"
DESCRIPTION = "FDM material database for use with Cura"
LICENSE = "CC0-1.0"

PV = "4.13.0"

RPM_NAME = "cura-fdm-materials-4.13.0-1.13.noarch.rpm"
RPM_HASH = "d2f38e17507218d433abea9275ce4b4561608c75bc9e199cd6dcc4c3661c640e7ac7aa9a60017c0ac72147730f051594f86dbc74746498eb810b7641e371dcd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cura-fdm-materials"

RDEPENDS:${PN} += ""

inherit rpm
