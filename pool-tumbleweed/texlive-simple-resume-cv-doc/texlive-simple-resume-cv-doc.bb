SUMMARY = "Documentation for texlive-simple-resume-cv"
DESCRIPTION = "This package includes the documentation for texlive-simple-resume-cv"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn43057"

RPM_NAME = "texlive-simple-resume-cv-doc-2026.226.svn43057-60.2.noarch.rpm"
RPM_HASH = "5c734509c75f61717c325d608c9c25695f4add864ab62e187d27498bbf730fc29c01dfab1f96db654f506805549a02fc3c86b7611ce8bc7609c8c273addc3ce4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-simple-resume-cv-doc"

RDEPENDS:${PN} += ""

inherit rpm
