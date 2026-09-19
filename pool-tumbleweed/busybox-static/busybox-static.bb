SUMMARY = "Static linked version of Busybox, a compact UNIX utility collection"
DESCRIPTION = "BusyBox combines tiny versions of many common UNIX utilities into a \
single executable."
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-static-1.38.0-2.1.aarch64.rpm"
RPM_HASH = "04e38e2edec5ddbd62e14eafd5af4162eea2f3cd4c033b7114614d5d498913602580bc5da0ef4c11625dc6d5fd91a286b2914820203c40a547e88d3169ff2d28"

RPROVIDES:${PN} += "busybox-static"

RDEPENDS:${PN} += ""

inherit rpm
