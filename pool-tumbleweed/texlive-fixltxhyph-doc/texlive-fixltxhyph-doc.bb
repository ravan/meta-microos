SUMMARY = "Documentation for texlive-fixltxhyph"
DESCRIPTION = "This package includes the documentation for texlive-fixltxhyph"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.5svn73227"

RPM_NAME = "texlive-fixltxhyph-doc-2026.226.0.0.5svn73227-59.2.noarch.rpm"
RPM_HASH = "f2c1b07ccd41fee35588708bbd67d366d576dbf21394f2528111798b3bd7af1ca6884e226facfaf557ed938158203f6b048445304c8f7dc326c692f9f2ebe591"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fixltxhyph-doc"

RDEPENDS:${PN} += ""

inherit rpm
