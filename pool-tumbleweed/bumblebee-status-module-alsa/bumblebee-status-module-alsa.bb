SUMMARY = "Control the alsa volume"
DESCRIPTION = "Get volume level or control it."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-alsa-2.1.5-4.7.noarch.rpm"
RPM_HASH = "ee5ba5b776ef465f79592d43b6be25fb29a6df865537148eb3ae7f693888e2d69c61d9f01206e6016cd9648c324e11079f0ff0979e43dcbd052fe5c415528405"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-alsa"

RDEPENDS:${PN} += "alsa-utils \
bumblebee-status"

inherit rpm
