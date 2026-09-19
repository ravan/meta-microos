SUMMARY = "Documentation for texlive-latex2pydata"
DESCRIPTION = "This package includes the documentation for texlive-latex2pydata"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.7.0svn78166"

RPM_NAME = "texlive-latex2pydata-doc-2026.226.0.0.7.0svn78166-61.2.noarch.rpm"
RPM_HASH = "99417a7559b90c59021067f8e5afca312a103a2e32356d817e22f4d98b152f8841108fdbcdb324b791a999a48291269e76b7d91b27a39540d8e9cd654c35cd82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex2pydata-doc"

RDEPENDS:${PN} += ""

inherit rpm
