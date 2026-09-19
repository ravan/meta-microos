SUMMARY = "Documentation for texlive-leaflet"
DESCRIPTION = "This package includes the documentation for texlive-leaflet"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1csvn77682"

RPM_NAME = "texlive-leaflet-doc-2026.226.2.1csvn77682-61.2.noarch.rpm"
RPM_HASH = "1457f40838981b026bf4e7226152c79f0bcc45c078864b3fc8ffd7380e05d39d587f777d788d4e4921675884a04c709653307c9b7c3ae1dbf0917174168219f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-leaflet-doc"

RDEPENDS:${PN} += ""

inherit rpm
