SUMMARY = "Plugin for tukit to update sysexe images"
DESCRIPTION = "This package contains a plugin for tukit, so that transactional-update not only updates the packages of the host OS, but also the sysext images."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.0+git20260820.0628c3a"

RPM_NAME = "sysextmgr-tukit-plugin-1.3.0+git20260820.0628c3a-1.1.noarch.rpm"
RPM_HASH = "ee9667881711054708f2857f0f58e002a499e08f667539a0a02ff2690263889e8349a17c6d78320e3d681ac3e68c35f059cbb86022b5e084264c5fd8dc26ff2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sysextmgr-tukit-plugin"

RDEPENDS:${PN} += "sysextmgr"

inherit rpm
