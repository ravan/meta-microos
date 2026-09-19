SUMMARY = "Documentation for texlive-pst-calculate"
DESCRIPTION = "This package includes the documentation for texlive-pst-calculate"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.02svn77682"

RPM_NAME = "texlive-pst-calculate-doc-2026.226.0.0.02svn77682-59.2.noarch.rpm"
RPM_HASH = "c14bedb21a7ae183cad2d4f23d9161ca5182bd5a69370de08905de72f09301152bc1d65b219e1febe133242ac32023e04fdd791e74b7725de52cb687249ef328"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-calculate-doc"

RDEPENDS:${PN} += ""

inherit rpm
