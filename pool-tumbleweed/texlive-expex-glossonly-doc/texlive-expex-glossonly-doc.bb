SUMMARY = "Documentation for texlive-expex-glossonly"
DESCRIPTION = "This package includes the documentation for texlive-expex-glossonly"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9bsvn69914"

RPM_NAME = "texlive-expex-glossonly-doc-2026.226.0.0.9bsvn69914-59.2.noarch.rpm"
RPM_HASH = "36671e6aa28444448466c5099d72e7a6d52a040b2a06fe88cbc7430b9421eee93e9b7b1839ef02ac2118697f2604d72f33ee58e7dd71dac07ef9e1743586291e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-expex-glossonly-doc"

RDEPENDS:${PN} += ""

inherit rpm
