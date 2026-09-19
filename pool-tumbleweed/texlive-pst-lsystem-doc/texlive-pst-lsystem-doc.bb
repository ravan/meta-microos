SUMMARY = "Documentation for texlive-pst-lsystem"
DESCRIPTION = "This package includes the documentation for texlive-pst-lsystem"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.02svn49556"

RPM_NAME = "texlive-pst-lsystem-doc-2026.226.0.0.02svn49556-59.2.noarch.rpm"
RPM_HASH = "d2fdef79d3292aeb140f4adf4fc861a7ee6552cb352f9a27264b5acaa032a8ff5c7d479899f9b29c8d4c840b734f80f4161fdd73d42c35fd3881c3801877eca7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-lsystem-doc"

RDEPENDS:${PN} += ""

inherit rpm
