SUMMARY = "Documentation for qt6-serialbus in HTML format"
DESCRIPTION = "This package contains documentation for qt6-serialbus in HTML format."
LICENSE = "GFDL-1.3-or-later"

PV = "6.11.2"

RPM_NAME = "qt6-serialbus-docs-html-6.11.2-1.1.aarch64.rpm"
RPM_HASH = "9bdd7379077e561b6f0bebe196a3d926df5897c7f87d7513ca371385fd939a3273d19b2bf7e876b404df651af339517ef0007f2714ecaa157c58c7d974f39340"

RPROVIDES:${PN} += "qt6-serialbus-docs-html"

RDEPENDS:${PN} += ""

inherit rpm
