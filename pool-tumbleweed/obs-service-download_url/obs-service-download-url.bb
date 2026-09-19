SUMMARY = "An OBS source service: wget download tool"
DESCRIPTION = "This is a source service for openSUSE Build Service. \
 \
It supports downloading files from given URLs via wget"
LICENSE = "GPL-2.0-or-later"

PV = "0.2.1"

RPM_NAME = "obs-service-download_url-0.2.1-2.3.noarch.rpm"
RPM_HASH = "78ef68904ed9948ac0c891bd0b7e2b030e42142c493d1c17a0971542948bfab8062290c7a60aa894c1696459a6b1ce5030bb87aa42a70884e9472468b71f6964"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-download-url"

RDEPENDS:${PN} += "/usr/bin/bash \
wget"

inherit rpm
