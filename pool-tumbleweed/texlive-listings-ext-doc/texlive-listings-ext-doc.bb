SUMMARY = "Documentation for texlive-listings-ext"
DESCRIPTION = "This package includes the documentation for texlive-listings-ext"
LICENSE = "LPPL-1.0"

PV = "2026.226.67svn29349"

RPM_NAME = "texlive-listings-ext-doc-2026.226.67svn29349-61.2.noarch.rpm"
RPM_HASH = "53a1fc2fe5d1f85625d5a69c329159d7178106f0f4739e9b829f73f7e925e11b1f8b2b3f03cf063bb29fdb41b8ede4626bda432609b1976b3ad782b9a78177ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-listings-ext-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
