SUMMARY = "Documentation for texlive-kinematikz"
DESCRIPTION = "This package includes the documentation for texlive-kinematikz"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn61392"

RPM_NAME = "texlive-kinematikz-doc-2026.226.1.0svn61392-63.2.noarch.rpm"
RPM_HASH = "bef95b936ed087df6de3ab81aeaf90f44bdaa6dbb2b45a65b21afec6b9c1b254caf4d002c3ab832ca5d40bae4c88389997add5bdc411398747a0be05ba275870"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kinematikz-doc"

RDEPENDS:${PN} += ""

inherit rpm
