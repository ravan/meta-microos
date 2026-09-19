SUMMARY = "Documentation for texlive-doi"
DESCRIPTION = "This package includes the documentation for texlive-doi"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77682"

RPM_NAME = "texlive-doi-doc-2026.226.svn77682-59.2.noarch.rpm"
RPM_HASH = "f7730b9a3521b0c9453af5254993859f1203f9019d7ef5883181d7d205ac391e43d5e4518a9215650b54f9161855029eda746d0c2ad4c44c824e44ad0807a192"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-doi-doc"

RDEPENDS:${PN} += ""

inherit rpm
