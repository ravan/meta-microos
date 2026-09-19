SUMMARY = "SCAP content"
DESCRIPTION = "SCAP content for Fedora delivered by Open-SCAP project."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.4"

RPM_NAME = "openscap-content-1.4.4-1.3.aarch64.rpm"
RPM_HASH = "267c545a3556875c02c106956845c0f8cc58db5d073a58eb23e0f10cd61cc1131b39d0d48dabfb686b4c2bec44b444199a644e3e57f2d415534356763ef8c883"

RPROVIDES:${PN} += "openscap-content"

RDEPENDS:${PN} += "libopenscap33 \
openscap"

inherit rpm
