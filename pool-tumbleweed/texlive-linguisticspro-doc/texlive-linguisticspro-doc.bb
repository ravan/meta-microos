SUMMARY = "Documentation for texlive-linguisticspro"
DESCRIPTION = "This package includes the documentation for texlive-linguisticspro"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-linguisticspro-doc-2026.226.svn77682-61.2.noarch.rpm"
RPM_HASH = "9c3f4f821ae60185aaa13a0cbefd4d4dd0fd1e51a5a4fb120c8c324a58ff42e183d523c1d7287095ce87c1fc07e8a593167a74625878048426106ebd052d9835"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-linguisticspro-doc"

RDEPENDS:${PN} += ""

inherit rpm
