SUMMARY = "Documentation for texlive-nolbreaks"
DESCRIPTION = "This package includes the documentation for texlive-nolbreaks"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.2svn77682"

RPM_NAME = "texlive-nolbreaks-doc-2026.226.1.2svn77682-61.2.noarch.rpm"
RPM_HASH = "f4c828c849e671c3c92c52c279df7bf6ca03e35f0128f8eaa6d16d02b523ce3eca162a404e0ff70018d886575d39884e8fa022cb1fe047ebed0d1d1f70d3b826"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nolbreaks-doc"

RDEPENDS:${PN} += ""

inherit rpm
