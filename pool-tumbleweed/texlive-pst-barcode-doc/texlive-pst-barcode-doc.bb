SUMMARY = "Documentation for texlive-pst-barcode"
DESCRIPTION = "This package includes the documentation for texlive-pst-barcode"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.20svn77682"

RPM_NAME = "texlive-pst-barcode-doc-2026.226.0.0.20svn77682-59.2.noarch.rpm"
RPM_HASH = "10e1e5822d67502fa5fa75f507878303a0bdb12ee96ccd80ea23081c4e6a76bb5b6112cf8d7bfcc00ac1103d5fe149671fc7d27331c2228b9a6a3ab32aa4c53f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-barcode-doc"

RDEPENDS:${PN} += ""

inherit rpm
