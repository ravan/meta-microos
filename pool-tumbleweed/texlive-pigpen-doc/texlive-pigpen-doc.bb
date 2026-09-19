SUMMARY = "Documentation for texlive-pigpen"
DESCRIPTION = "This package includes the documentation for texlive-pigpen"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn77682"

RPM_NAME = "texlive-pigpen-doc-2026.226.0.0.3svn77682-58.2.noarch.rpm"
RPM_HASH = "ac27b549e62d147bdad7aeaa956f4bb672a28f9b90de4e36d9da35cfd7f1a583695b17b3081a462d5ca250b0d7cfd9e86fc00b427ab5a781666eb529b49bb00e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pigpen-doc"

RDEPENDS:${PN} += ""

inherit rpm
