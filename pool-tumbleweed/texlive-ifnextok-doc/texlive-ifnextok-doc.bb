SUMMARY = "Documentation for texlive-ifnextok"
DESCRIPTION = "This package includes the documentation for texlive-ifnextok"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn23379"

RPM_NAME = "texlive-ifnextok-doc-2026.226.0.0.3svn23379-60.2.noarch.rpm"
RPM_HASH = "e28c696974d78c0481a151737d8dd1d824402215f0a08e01671162911b43e70e5e6db81f38fb6225ceda64fbedbea6cb1f5d9cb4892f3a5f1497c972b1f648fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ifnextok-doc"

RDEPENDS:${PN} += ""

inherit rpm
