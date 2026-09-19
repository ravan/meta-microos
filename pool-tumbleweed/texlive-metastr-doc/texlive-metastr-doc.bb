SUMMARY = "Documentation for texlive-metastr"
DESCRIPTION = "This package includes the documentation for texlive-metastr"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.3svn74751"

RPM_NAME = "texlive-metastr-doc-2026.226.1.1.3svn74751-61.2.noarch.rpm"
RPM_HASH = "f71d98055f02c18ef142738b167b09f0f58443c2fc565b1527d275d481397bf13ad70399f09edbe6e964681dd8e89582af54fd26dfa35900377bf72c96fc8dfd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metastr-doc"

RDEPENDS:${PN} += ""

inherit rpm
