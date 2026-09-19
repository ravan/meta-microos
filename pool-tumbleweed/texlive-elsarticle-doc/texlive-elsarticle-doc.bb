SUMMARY = "Documentation for texlive-elsarticle"
DESCRIPTION = "This package includes the documentation for texlive-elsarticle"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.5svn77318"

RPM_NAME = "texlive-elsarticle-doc-2026.226.3.5svn77318-61.4.noarch.rpm"
RPM_HASH = "d9d962b5a7516fc263c5bd2cfd71922092063a5b83892cc63834cd95aa23e95b9717243fb14c830098dc7d093d62f1e2690752e30fcc75e9acc6fbb713137a48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-elsarticle-doc"

RDEPENDS:${PN} += ""

inherit rpm
