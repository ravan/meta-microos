SUMMARY = "Documentation for texlive-mhequ"
DESCRIPTION = "This package includes the documentation for texlive-mhequ"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.72svn64978"

RPM_NAME = "texlive-mhequ-doc-2026.226.1.72svn64978-61.2.noarch.rpm"
RPM_HASH = "ec58b50985df56f2fc875bc742f56fe3cfb15e42983061788647c22a1d6b3b52349950f292dadf679f80e270ef8de6895c27d6efeb276094cc409a8003e5ad92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mhequ-doc"

RDEPENDS:${PN} += ""

inherit rpm
