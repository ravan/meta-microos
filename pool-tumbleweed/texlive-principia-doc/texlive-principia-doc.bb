SUMMARY = "Documentation for texlive-principia"
DESCRIPTION = "This package includes the documentation for texlive-principia"
LICENSE = "LPPL-1.0"

PV = "2026.226.3.4svn74710"

RPM_NAME = "texlive-principia-doc-2026.226.3.4svn74710-59.2.noarch.rpm"
RPM_HASH = "07d3200258c3a13ca27d0192b065b123effe2d184dc7be6dcb5e83ef7683f2a8f6339f93188c1e30f5b5d592b0523dd146f159d6453d3588b7ee62173090430b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-principia-doc"

RDEPENDS:${PN} += ""

inherit rpm
