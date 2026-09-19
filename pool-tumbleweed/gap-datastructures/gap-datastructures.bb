SUMMARY = "GAP: Collection of standard data structures for GAP"
DESCRIPTION = "The 'datastructures' package provides some standard data structures \
for the GAP CAS."
LICENSE = "GPL-2.0-or-later"

PV = "0.4.3"

RPM_NAME = "gap-datastructures-0.4.3-1.1.aarch64.rpm"
RPM_HASH = "0666cc884fa733fc453be52586c4d2526665b89da8ba251e3e509689e34a15147a4b22af1d95ca488252ac0a33a8acde60510c5a8084884c4907d6eff3da5c17"

RPROVIDES:${PN} += "gap-datastructures"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
gap-core"

inherit rpm
