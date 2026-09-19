SUMMARY = "Documentation for texlive-plantuml"
DESCRIPTION = "This package includes the documentation for texlive-plantuml"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6.0svn75196"

RPM_NAME = "texlive-plantuml-doc-2026.226.0.0.6.0svn75196-58.2.noarch.rpm"
RPM_HASH = "6347f2ab859845e8a8076e56796e3e5c97917eb450390d8830a6efed00ab4b14821efc524dd25a64d59b436a9fa79f8ccc417c7f171fa0dccfb4ba5efef60390"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-plantuml-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
