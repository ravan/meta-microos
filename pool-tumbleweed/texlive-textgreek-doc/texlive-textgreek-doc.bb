SUMMARY = "Documentation for texlive-textgreek"
DESCRIPTION = "This package includes the documentation for texlive-textgreek"
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.7svn77682"

RPM_NAME = "texlive-textgreek-doc-2026.227.0.0.7svn77682-62.2.noarch.rpm"
RPM_HASH = "16b1bd4cd9ad0936557beb0384925ebae3342d55ca2335c76ac7046b95aab67aca12a741bda801db8d1010d61445415714a948f044509e39e26ff932ce8973ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-textgreek-doc"

RDEPENDS:${PN} += ""

inherit rpm
