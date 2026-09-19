SUMMARY = "Documentation for texlive-ccicons"
DESCRIPTION = "This package includes the documentation for texlive-ccicons"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6svn77682"

RPM_NAME = "texlive-ccicons-doc-2026.226.1.6svn77682-59.2.noarch.rpm"
RPM_HASH = "6132c442eaf59dfb4b87fad3d8f3e64a02a37ead25bf8c47c071addc13abe772c92ed12304d6d1914be91e05cbb81b55f27fce93bbb45b9261b33b8ad036431e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ccicons-doc"

RDEPENDS:${PN} += ""

inherit rpm
