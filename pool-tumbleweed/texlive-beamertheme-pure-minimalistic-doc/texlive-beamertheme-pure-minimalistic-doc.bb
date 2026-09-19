SUMMARY = "Documentation for texlive-beamertheme-pure-minimalistic"
DESCRIPTION = "This package includes the documentation for texlive-beamertheme-pure-minimalistic"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.2.0.0svn56934"

RPM_NAME = "texlive-beamertheme-pure-minimalistic-doc-2026.226.2.0.0svn56934-61.2.noarch.rpm"
RPM_HASH = "80a6b607d9d12e3652c30fa3565501da8ed41275edd1f8d908ecd9b1a06f3fa98efedfc2e984cdf0d8bba7dada4d87c2366c72141f66cc5abf37464e9d7b4a8e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamertheme-pure-minimalistic-doc"

RDEPENDS:${PN} += ""

inherit rpm
