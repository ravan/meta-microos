SUMMARY = "Busybox applets replacing iproute2"
DESCRIPTION = "This package contains the symlinks to replace iproute2 with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-iproute2-1.38.0-42.2.noarch.rpm"
RPM_HASH = "fff68f7019577b0d0e33088e0a4239b011a3fc8821fe24dfd58d0da33a0d80e04b745111362caf42e21e9fd8bc26bdf3e279c95a5b53cbab885b3d449654aeda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/sbin/ifup \
/sbin/ip \
busybox-iproute2"

RDEPENDS:${PN} += "busybox"

inherit rpm
