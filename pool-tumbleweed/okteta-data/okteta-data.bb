SUMMARY = "Hex Editor data files"
DESCRIPTION = "Data files used by Okteta/libKasten, e.g. structures definitions."
LICENSE = "GFDL-1.2-only & GPL-2.0-only"

PV = "0.26.28"

RPM_NAME = "okteta-data-0.26.28-1.1.noarch.rpm"
RPM_HASH = "45d310ec62b1db4198287b47b608befae5c02c1141a59a7411a078269958e92aecaf301a0c3b1e644a7363de899e30e01597d6f1368680fe28ed64964e5ccb8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "okteta-data"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
