SUMMARY = "Documentation for texlive-bib2qr"
DESCRIPTION = "This package includes the documentation for texlive-bib2qr"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn71940"

RPM_NAME = "texlive-bib2qr-doc-2026.226.0.0.2svn71940-61.2.noarch.rpm"
RPM_HASH = "3b853925953e2fa13b45c7c6cfba2c4b0a756c6e6d14821065030093673efe18af503cc239f9d2ec1ef03df791a93bd70f496269405012ebc1d4aff0e72a90f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bib2qr-doc"

RDEPENDS:${PN} += ""

inherit rpm
