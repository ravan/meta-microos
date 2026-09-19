SUMMARY = "Awesome Window Manager integration for LeechCraft"
DESCRIPTION = "This package allows to start Leechcraft as a Desktop Environment with \
the Awesome Window Manager."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-fenet-awesome-0.6.70+git.18808.g3467692359-3.1.noarch.rpm"
RPM_HASH = "1e41342fd03f588e5664de8d703ddbc53ffc50def2d13de7b414074b8071b2f082d5b42cee19bbb7cea3719c6120a90e52bb69e64cdd8fd3549aedf91b76e13f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "leechcraft-fenet-awesome \
leechcraft-fenet-wm"

RDEPENDS:${PN} += "/usr/bin/sh \
awesome \
leechcraft-fenet"

inherit rpm
