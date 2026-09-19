SUMMARY = "Documentation for texlive-notespages"
DESCRIPTION = "This package includes the documentation for texlive-notespages"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.8.1svn76790"

RPM_NAME = "texlive-notespages-doc-2026.226.0.0.8.1svn76790-61.2.noarch.rpm"
RPM_HASH = "8653098e6e34c58d3738858e73c7047138522221ad6d9fbbd6b36ac642906292c1faf2930955421bea366675092b9c68eb899edabf60bcaa4644563ea90576b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-notespages-doc"

RDEPENDS:${PN} += ""

inherit rpm
