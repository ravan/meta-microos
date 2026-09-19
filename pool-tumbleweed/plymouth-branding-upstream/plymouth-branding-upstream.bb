SUMMARY = "Default configuration file and branding from the Plymouth upstream"
DESCRIPTION = "This package contains the /usr/share/plymouthd.defaults which contains the basic \
settings and branding from the upstream."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-branding-upstream-22.02.122+94.4bd41a3-20.6.noarch.rpm"
RPM_HASH = "d28c2b461f5dd66611fc2895dded9b5852e2678baf33eace16ca448e41f71a1a992dd13bc121c370e57023d6a8b192eb33013f247b15994b1458bd04e24aef02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-branding \
plymouth-branding-upstream"

RDEPENDS:${PN} += ""

inherit rpm
