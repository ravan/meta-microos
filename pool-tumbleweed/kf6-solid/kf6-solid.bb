SUMMARY = "KDE Desktop hardware abstraction"
DESCRIPTION = "Solid is a device integration framework. It provides a way of querying and \
interacting with hardware independently of the underlying operating system."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-solid-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "be46c31b5e2dbf3bd9a5e7b49607c03dab970ed9b94727cf223bb144ebf88c9d902a1319a2d746bcf1ec744973b033907f878ee165432154af909fd68f59d2b0"

RPROVIDES:${PN} += "kf6-solid"

RDEPENDS:${PN} += ""

inherit rpm
