SUMMARY = "Documentation for texlive-dice"
DESCRIPTION = "This package includes the documentation for texlive-dice"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn28501"

RPM_NAME = "texlive-dice-doc-2026.226.svn28501-59.2.noarch.rpm"
RPM_HASH = "3b0fc541b1c7d1b34f8a401d15987b7177e6557ac961f3b215fa09a871cb08dd9ca3fef74199c4ffb76ecf515dbb3d9b29648135aba7e5e39ca388f81a69e4f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dice-doc"

RDEPENDS:${PN} += ""

inherit rpm
