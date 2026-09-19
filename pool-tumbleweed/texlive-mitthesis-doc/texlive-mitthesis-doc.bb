SUMMARY = "Documentation for texlive-mitthesis"
DESCRIPTION = "This package includes the documentation for texlive-mitthesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.22svn77682"

RPM_NAME = "texlive-mitthesis-doc-2026.226.1.22svn77682-61.2.noarch.rpm"
RPM_HASH = "02410203cc5edfc2f8d724f6bf69701e7fdcf896a2510019abc8178b8ed33f234149acee7d2a6827fe9ccb88d056645059a2a71fcd8a317ef62a9b1f9b767718"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mitthesis-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
