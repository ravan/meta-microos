SUMMARY = "Documentation for texlive-verbdef"
DESCRIPTION = "This package includes the documentation for texlive-verbdef"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn77682"

RPM_NAME = "texlive-verbdef-doc-2026.226.0.0.2svn77682-60.2.noarch.rpm"
RPM_HASH = "f251dce429e1ef0923d28735eeafdfea468f1fd945c930271160a867a0f176f6602889ef885790cd4bf65a7a5003eb8e06f8318880ee2599f4e150195e4cdb87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-verbdef-doc"

RDEPENDS:${PN} += ""

inherit rpm
