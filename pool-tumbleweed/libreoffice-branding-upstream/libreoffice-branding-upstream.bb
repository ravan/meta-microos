SUMMARY = "Original Branding for LibreOffice"
DESCRIPTION = "This package includes the original branding for the LibreOffice office suite."
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-branding-upstream-26.8.0.3-1.1.noarch.rpm"
RPM_HASH = "1d8c3d835d6adc955fc0d3e1f8be77e31d21011972d244e4e8d99b9d4706b3cb25317098ce03b8a5de18636455f81b7b7f8286600905b1df9a19f11f8f858037"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libreoffice-branding \
libreoffice-branding-SLE \
libreoffice-branding-openSUSE \
libreoffice-branding-upstream"

RDEPENDS:${PN} += ""

inherit rpm
