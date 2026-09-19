SUMMARY = "Documentation for texlive-uni-wtal-ger"
DESCRIPTION = "This package includes the documentation for texlive-uni-wtal-ger"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn31541"

RPM_NAME = "texlive-uni-wtal-ger-doc-2026.226.0.0.2svn31541-60.2.noarch.rpm"
RPM_HASH = "1b3829f8fc09d423551e8f41fc941fb10db45d1b860fee067ea0cf778ab724ce29bebce21dd2dea3657e8f824b27631d77be9d4f48fef3a8a6acb82b8743252e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-uni-wtal-ger-doc-de;en \
texlive-uni-wtal-ger-doc"

RDEPENDS:${PN} += ""

inherit rpm
