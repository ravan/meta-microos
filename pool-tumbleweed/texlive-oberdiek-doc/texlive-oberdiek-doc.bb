SUMMARY = "Documentation for texlive-oberdiek"
DESCRIPTION = "This package includes the documentation for texlive-oberdiek"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn71916"

RPM_NAME = "texlive-oberdiek-doc-2026.226.svn71916-61.2.noarch.rpm"
RPM_HASH = "3731f33a4fd92b7cdf9243185023f41b8076bbfc08953f0fe7939fb6eb05e10c3213bda8b81ecef2f6edfa456d87a74c00220a7365ed7b68e123529eb5802554"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-oberdiek-doc"

RDEPENDS:${PN} += ""

inherit rpm
