SUMMARY = "Documentation for qt6-websockets in HTML format"
DESCRIPTION = "This package contains documentation for qt6-websockets in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-websockets-docs-html-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "d604ba252c401b9a73a9f4c0b02f276056f4d7af638eb73c24f20940f892a675af93af9e7b5bcafe1080f1edabaa3b10933f1ece0ef4d9052a196b0429357299"

RPROVIDES:${PN} += "qt6-websockets-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
