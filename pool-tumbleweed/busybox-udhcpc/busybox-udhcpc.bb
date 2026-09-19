SUMMARY = "Busybox applets providing udhcp client"
DESCRIPTION = "This package contains the symlinks to provide the udhcp clients with busybox. \
For using udhcpc scripts to setup the network are required, they are not \
provided with this package."
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-udhcpc-1.38.0-42.2.noarch.rpm"
RPM_HASH = "7d33cd6962827598865e4440ffeab87719e06cd500f6765b3d7b71efd30864f892690445417952bf9d94a670125cd70424adacba6b740020299803e9ca7b7730"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-udhcpc"

RDEPENDS:${PN} += "busybox"

inherit rpm
