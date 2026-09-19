SUMMARY = "GAP: THreshold ELements, Modeling and Applications"
DESCRIPTION = "The Thelma package is package with algorithms to deal with threshold elements."
LICENSE = "GPL-2.0-or-later"

PV = "1.3"

RPM_NAME = "gap-thelma-1.3-1.9.noarch.rpm"
RPM_HASH = "f254fce673f3e29b3c2807d9b22df513198fd708adeaf6fa99350264da9d10a7f876bfa9224c6835ee69f847e17a4db8ed44075f4c7ed486c14604af0d1f4067"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-thelma"

RDEPENDS:${PN} += "gap-core \
gap-gapdoc \
gap-gauss"

inherit rpm
