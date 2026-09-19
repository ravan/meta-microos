SUMMARY = "Documentation for texlive-droit-fr"
DESCRIPTION = "This package includes the documentation for texlive-droit-fr"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn39802"

RPM_NAME = "texlive-droit-fr-doc-2026.226.1.2svn39802-59.2.noarch.rpm"
RPM_HASH = "398338db20c4dce00f64ad351e4d1d51d39b5c4502e16de993089687dd6c523feefe5f2ecaf3c4dbc6c8ede709dfdd2c91da545f7cf6b46b478052fadfc723e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-droit-fr-doc-fr \
texlive-droit-fr-doc"

RDEPENDS:${PN} += ""

inherit rpm
