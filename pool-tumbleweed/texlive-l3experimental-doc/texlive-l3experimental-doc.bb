SUMMARY = "Documentation for texlive-l3experimental"
DESCRIPTION = "This package includes the documentation for texlive-l3experimental"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76637"

RPM_NAME = "texlive-l3experimental-doc-2026.226.svn76637-63.2.noarch.rpm"
RPM_HASH = "9fb6b13a53cb3da71e4dcfe8e4fb184ec79a44b69531a008868aed557df67913f8e33cec01b4298f3455d7117f16959d05c1cc971a1a8dcda6d4ed9f04a451b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-l3experimental-doc"

RDEPENDS:${PN} += ""

inherit rpm
