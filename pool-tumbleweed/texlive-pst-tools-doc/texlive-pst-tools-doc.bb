SUMMARY = "Documentation for texlive-pst-tools"
DESCRIPTION = "This package includes the documentation for texlive-pst-tools"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.12svn60621"

RPM_NAME = "texlive-pst-tools-doc-2026.226.0.0.12svn60621-60.4.noarch.rpm"
RPM_HASH = "c9190701c135eed177a46d937c5be3fb0b2d83bebffb3999ef759de19d74fcc5c528aa3cee83e5c217e51ce66287fca153eb2a102100556936a15245726961f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-tools-doc"

RDEPENDS:${PN} += ""

inherit rpm
