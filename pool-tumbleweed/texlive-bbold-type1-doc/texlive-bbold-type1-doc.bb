SUMMARY = "Documentation for texlive-bbold-type1"
DESCRIPTION = "This package includes the documentation for texlive-bbold-type1"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn33143"

RPM_NAME = "texlive-bbold-type1-doc-2026.226.svn33143-61.2.noarch.rpm"
RPM_HASH = "354eb3441483be23fbb99fb3fb5c11700e54e09e3ab1e9f2ad68e21b6b867fac641140784cb091cd19bb71bfd3b278a3e057c901ae8e6bf9214ca5a4c13e89b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bbold-type1-doc"

RDEPENDS:${PN} += ""

inherit rpm
