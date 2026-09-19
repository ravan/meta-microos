SUMMARY = "Documentation for texlive-circuitikz"
DESCRIPTION = "This package includes the documentation for texlive-circuitikz"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.8.5svn77600"

RPM_NAME = "texlive-circuitikz-doc-2026.226.1.8.5svn77600-60.2.noarch.rpm"
RPM_HASH = "71e06fee199dc29a76d72238b8aae395bf6a7c599fd3e35a6dbacf5aa72be21a5e40216fd27d21485f9e143f6d70b0dd93d23eb7c544b842bcbab566a40cc1a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-circuitikz-doc"

RDEPENDS:${PN} += ""

inherit rpm
