SUMMARY = "Documentation for texlive-fixjfm"
DESCRIPTION = "This package includes the documentation for texlive-fixjfm"
LICENSE = "SUSE-TeX"

PV = "2026.226.0.0.8svn77682"

RPM_NAME = "texlive-fixjfm-doc-2026.226.0.0.8svn77682-59.2.noarch.rpm"
RPM_HASH = "9035305009c52fb68ba1ec847c4aa4cd43a044c09874e50e08f4d79e86a9610c8ff7587586b19c9dc12d8c1d8199c0eb0e1550c9c39cbf02c874379efacaf2a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fixjfm-doc"

RDEPENDS:${PN} += ""

inherit rpm
