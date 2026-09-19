SUMMARY = "Rpm plugin for Linux namespace isolation functionality"
DESCRIPTION = "Rpm plugin for Linux namespace isolation functionality."
LICENSE = "GPL-2.0-or-later"

PV = "4.20.1"

RPM_NAME = "rpm-plugin-unshare-4.20.1-10.1.aarch64.rpm"
RPM_HASH = "c03de1c3d38c262540d7810a3205652b3574ce4d5585b25b236ecccce8e3b260ec91c24751fee3f2ee48ca96921de01378ac697e08ce6ab482773e5a8b7c19ae"

RPROVIDES:${PN} += "rpm-plugin-unshare"

RDEPENDS:${PN} += "rpm"

inherit rpm
