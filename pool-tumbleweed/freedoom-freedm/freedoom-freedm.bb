SUMMARY = "Deathmatch levels for Doom"
DESCRIPTION = "A set of deathmatch levels for the DOOM game engine, based on the \
freely redistributable Freedoom game files."
LICENSE = "BSD-3-Clause"

PV = "0.13.0"

RPM_NAME = "freedoom-freedm-0.13.0-1.8.noarch.rpm"
RPM_HASH = "066e673020143644e2f3cfc17061cfc83d715edbd9416538b7e921c36ef9a9cc20f942b7ede5e847d1e26322c1fa5acc6f05aa3413648111b645d2bd73a37af7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "freedoom-freedm"

RDEPENDS:${PN} += "freedoom"

inherit rpm
