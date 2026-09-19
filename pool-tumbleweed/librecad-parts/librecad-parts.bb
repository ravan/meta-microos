SUMMARY = "Parts collection for LibreCAD"
DESCRIPTION = "Collection of parts for LibreCAD, a Qt application to design 2D \
CAD drawings."
LICENSE = "(Apache-2.0 | SUSE-GPL-3.0+-with-font-exception) & GPL-2.0-only"

PV = "2.2.1.5"

RPM_NAME = "librecad-parts-2.2.1.5-1.1.noarch.rpm"
RPM_HASH = "abce153fa620f5bb95a4f0ed9f216d59e35c4a4404f999c9874daafcc45c972c5f6462d3ee408bbe851722ccf2861b1122b751f69006db87558719033802013b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "librecad-parts"

RDEPENDS:${PN} += "librecad"

inherit rpm
