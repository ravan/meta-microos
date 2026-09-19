SUMMARY = "Additional Import and Export Filters for LibreOffice"
DESCRIPTION = "This package includes some additional import and export filters for \
LibreOffice: \
- AportisDoc (Palm) \
- Pocket Excel \
- Pocket Word \
- DocBook \
- XHTML"
LICENSE = "LGPL-3.0-or-later & MPL-2.0+"

PV = "26.8.0.3"

RPM_NAME = "libreoffice-filters-optional-26.8.0.3-1.1.aarch64.rpm"
RPM_HASH = "163c047a3b73490637669a9d2c61513103756cba534972da3720aa8bd631ca0d3065c4516cf8c26092b60f6e8a59350b159798618e6d1d53f1d2c7f11e4865db"

RPROVIDES:${PN} += "libreoffice-filters-optional"

RDEPENDS:${PN} += "libreoffice-calc \
libreoffice-draw \
libreoffice-impress \
libreoffice-math \
libreoffice-writer"

inherit rpm
