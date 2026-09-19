SUMMARY = "Documentation for texlive-biblatex-socialscienceshuberlin"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-socialscienceshuberlin"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0.1svn76790"

RPM_NAME = "texlive-biblatex-socialscienceshuberlin-doc-2026.226.0.0.0.1svn76790-61.2.noarch.rpm"
RPM_HASH = "2d066e54de5c1aad676356aab17fd5b0b24ccf86db6234bf8e728ffcaf2f241313ddd04cd2edf2ee7ddd8646e4877308a509f9e49291cce531a4f992b2eb7017"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-socialscienceshuberlin-doc"

RDEPENDS:${PN} += ""

inherit rpm
