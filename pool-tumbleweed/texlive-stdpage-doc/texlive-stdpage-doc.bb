SUMMARY = "Documentation for texlive-stdpage"
DESCRIPTION = "This package includes the documentation for texlive-stdpage"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6svn15878"

RPM_NAME = "texlive-stdpage-doc-2026.226.0.0.6svn15878-64.2.noarch.rpm"
RPM_HASH = "8e66513cb16921427ed0c932292ba9fc21cee6fc72ca794176a29e3eaf99cf8decf34ad52e4fff540bbd54be869142000e32b53e5ab205933a59e213f25938b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-stdpage-doc"

RDEPENDS:${PN} += ""

inherit rpm
