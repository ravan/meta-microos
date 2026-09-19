SUMMARY = "Documentation for texlive-braket"
DESCRIPTION = "This package includes the documentation for texlive-braket"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-braket-doc-2026.226.svn77682-59.2.noarch.rpm"
RPM_HASH = "f64f4a13fdec67f31a75fc341563f7ab8d68fca630167c3c97a765a942b23b66499590c560dc9ea835623fb8eb7d31ee198e7c20caa77ec91309a16b24e3d988"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-braket-doc"

RDEPENDS:${PN} += ""

inherit rpm
