SUMMARY = "Documentation for texlive-pst-hsb"
DESCRIPTION = "This package includes the documentation for texlive-pst-hsb"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.03svn66739"

RPM_NAME = "texlive-pst-hsb-doc-2026.226.0.0.03svn66739-59.2.noarch.rpm"
RPM_HASH = "c6e010ad84dc93e6bfc1ea5ff9cea07272dfe75f7b20ff0a2f168b47d6e5a3cdfe096dfe72baec6699fa430fcb98df44808614d87a90544f2876ec538b6eec18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-hsb-doc"

RDEPENDS:${PN} += ""

inherit rpm
