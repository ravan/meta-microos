SUMMARY = "Icon themes from Ubuntu MATE"
DESCRIPTION = "This package contains icon themes from Ubuntu MATE."
LICENSE = "CC-BY-SA-3.0 & CC-BY-SA-4.0 & GPL-3.0-or-later"

PV = "22.04.17"

RPM_NAME = "ubuntu-mate-icon-theme-22.04.17-1.12.noarch.rpm"
RPM_HASH = "b554570fed77fc65e14c007ec2c352c3bab5020afcb6f43aebc8641313bd29ed1aa91d9ceb929551042ef63cfb7d2b2b1b3fa29169272fa296024db57ea68669"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ubuntu-mate-icon-theme"

RDEPENDS:${PN} += "humanity-icon-theme \
ubuntu-mono-icon-theme"

inherit rpm
