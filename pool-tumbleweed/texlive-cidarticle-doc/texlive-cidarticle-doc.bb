SUMMARY = "Documentation for texlive-cidarticle"
DESCRIPTION = "This package includes the documentation for texlive-cidarticle"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn68976"

RPM_NAME = "texlive-cidarticle-doc-2026.226.1.1svn68976-60.2.noarch.rpm"
RPM_HASH = "55462a3f7c235b35888a18c0679c0b877322de8caa9eb912f8b46810d096be4bd191938c53f92eb5ba50ae292378117d4799d85029a8653dd78548de6e76baad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cidarticle-doc"

RDEPENDS:${PN} += ""

inherit rpm
