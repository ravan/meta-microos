SUMMARY = "Documentation for Pythia - a simulation program for particle collisions"
DESCRIPTION = "Pythia can be used to generate high-energy-physics events, i.e. sets \
of outgoing particles produced in the interactions between two \
incoming particles. \
 \
This package provides documentation for development with pythia."
LICENSE = "GPL-2.0-or-later"

PV = "8.316"

RPM_NAME = "pythia-doc-8.316-1.3.noarch.rpm"
RPM_HASH = "c61e5cfeb10e15b84c9cbefb65ab22dee1f61df42ac3bab7597c68f11667b24b4adb83f97fcf36b2e566f63ff833b7a9f545ea0dcc0b599c8c075c0ea8462973"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pythia-doc"

RDEPENDS:${PN} += ""

inherit rpm
