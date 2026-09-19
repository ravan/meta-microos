SUMMARY = "Documentation for texlive-fileinfo"
DESCRIPTION = "This package includes the documentation for texlive-fileinfo"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.81asvn28421"

RPM_NAME = "texlive-fileinfo-doc-2026.226.0.0.81asvn28421-59.2.noarch.rpm"
RPM_HASH = "06d4e4736a679b3a4c0aa5632919c3dd75faa871fff7a203ad6e1ef7da3cf7de4f2369db2a755180104233621f0332b2510c1a381523e9de637711c8e87a42e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fileinfo-doc"

RDEPENDS:${PN} += ""

inherit rpm
