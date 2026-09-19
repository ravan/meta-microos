SUMMARY = "Dockerfiles and scripts to setup testing containers"
DESCRIPTION = "Dockerfiles and scripts to setup testing containers"
LICENSE = "GPL-2.0-or-later"

PV = "3.3.7"

RPM_NAME = "cobbler-tests-containers-3.3.7-3.6.noarch.rpm"
RPM_HASH = "d04a546d0564cfae4b4fc85fbabd5e7bc5442d88d684cb7c333f38dea467c90cdce91232122ecca60a553a1c96466e4697d54cc0514a06b841c5a21e92ccf5de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cobbler-tests-containers"

RDEPENDS:${PN} += "/usr/bin/bash \
cobbler"

inherit rpm
