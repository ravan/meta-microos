SUMMARY = "Documentation for the libxfce4ui Library"
DESCRIPTION = "This package provides the documentation for the libxfce4ui library."
LICENSE = "LGPL-2.1-or-later"

PV = "4.20.2"

RPM_NAME = "libxfce4ui-doc-4.20.2-1.5.noarch.rpm"
RPM_HASH = "a8989fdeb4dc686e045a026b648db2e5393c5ed2ede0646f8975bd5e502f5887a4ceede986828b79e0a239d6a5f6179b8cf71096b97b1569624b88ca9111c015"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libxfce4ui-doc"

RDEPENDS:${PN} += ""

inherit rpm
