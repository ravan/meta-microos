SUMMARY = "Creates a tar archive from local directory"
DESCRIPTION = "Creates a tar archive from local directory"
LICENSE = "GPL-2.0-or-later"

PV = "0.12.4"

RPM_NAME = "obs-service-tar-0.12.4-1.1.noarch.rpm"
RPM_HASH = "399c6e75982d284c65e1b1a9fb22b7faabe9d7cff51eb1d4099e9f888c38720d9084fd5250d7fd25cbfee576a17760fa170d006cb5c6d692133945a244bc065c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-tar \
obs-service-tar-scm-/usr/lib/obs/service/tar.service"

RDEPENDS:${PN} += "obs-service-obs-scm-common"

inherit rpm
