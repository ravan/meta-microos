SUMMARY = "Documentation for texlive-serbian-def-cyr"
DESCRIPTION = "This package includes the documentation for texlive-serbian-def-cyr"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn23734"

RPM_NAME = "texlive-serbian-def-cyr-doc-2026.226.svn23734-60.2.noarch.rpm"
RPM_HASH = "5d6c7ad7d35806c445879d5dba111cb0b00c7cd753681406da936b37de3d4aed4842c41d7a702e16f4ed68fc3d64935869617f8019651e57fd03176117fbdfb5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-serbian-def-cyr-doc"

RDEPENDS:${PN} += ""

inherit rpm
