SUMMARY = "The mirroring service for pagure"
DESCRIPTION = "pagure-mirror is the service mirroring projects that asked for it outside \
of this pagure instance."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.14.1"

RPM_NAME = "pagure-mirror-5.14.1-3.3.noarch.rpm"
RPM_HASH = "b8fee90ee1fc0c289de22d8e3c2e5dda99153c19c5d37ba4d0fb1f550ace6f66f7e536a3b1fad87f51d57c1d01790bdc7bce4bb168b4f700b3719ecd35fc1a99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pagure-mirror"

RDEPENDS:${PN} += "/usr/bin/sh \
pagure \
systemd"

inherit rpm
