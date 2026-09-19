SUMMARY = "Documentation for texlive-komacv"
DESCRIPTION = "This package includes the documentation for texlive-komacv"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.2svn57721"

RPM_NAME = "texlive-komacv-doc-2026.226.1.1.2svn57721-63.2.noarch.rpm"
RPM_HASH = "b25f6db3001ea772e49e476f4c8b3ac128be39bfc178d7b6957b9229f5898d2585d23f82ff37e6771abdb1547ab918471263324c751230228ba5260a92462a15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-komacv-doc"

RDEPENDS:${PN} += ""

inherit rpm
