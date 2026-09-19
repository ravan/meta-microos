SUMMARY = "Documentation for the GNU compiler collection"
DESCRIPTION = "GNU info-pages for the GNU compiler collection covering both user-level \
and internals documentation."
LICENSE = "GFDL-1.2-only"

PV = "15.3.0+git11272"

RPM_NAME = "gcc15-info-15.3.0+git11272-1.4.noarch.rpm"
RPM_HASH = "74f45222efa556ab4b596e328decd2be8551bc85657a42236da0d8adf5b6eba9acd06e2bc0f0f619442ab0c250cc63b5bcfa6541af76f4188bbe9b8ec76823c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcc15-info"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
