SUMMARY = "Alternative designs"
DESCRIPTION = "Alternative designs for Adminer. Update the symbolic link at \
/usr/share/adminer/adminer.css to target the desired theme found in \
/usr/share/adminer/designs/*/adminer.css."
LICENSE = "GPL-2.0-only | Apache-2.0"

PV = "4.8.1"

RPM_NAME = "adminer-designs-4.8.1-1.13.noarch.rpm"
RPM_HASH = "5a52a002a72653aef1732d758b96ddfe772ee6962c875577893453b21c1354efe1222caf3fc3130fc47ee891cd3994650e0a26a651c84793c820a704faeaf2d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adminer-designs"

RDEPENDS:${PN} += "adminer"

inherit rpm
