SUMMARY = "Documentation for texlive-membranecomputing"
DESCRIPTION = "This package includes the documentation for texlive-membranecomputing"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2.1svn64627"

RPM_NAME = "texlive-membranecomputing-doc-2026.226.0.0.2.1svn64627-59.2.noarch.rpm"
RPM_HASH = "b05a5aa3a6fa2568f6ceef34e6734012f0f7ae77850951afe3e5a77b76d0041efaeea7ce7adbfa930d9cb908eb3a15ead930f37420deb69e6c8a3869dc7460b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-membranecomputing-doc"

RDEPENDS:${PN} += ""

inherit rpm
