SUMMARY = "Documentation for texlive-pythontex"
DESCRIPTION = "This package includes the documentation for texlive-pythontex"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.19svn77873"

RPM_NAME = "texlive-pythontex-doc-2026.226.0.0.19svn77873-60.4.noarch.rpm"
RPM_HASH = "1837b9da203d31c03911303e413fdf341ec70a80fd55770dd3107cb06c2fa3422c88cf476fe7c372931b9ed3c177e0b16dbeadc2a368d7d83574d21295c1237c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pythontex-doc"

RDEPENDS:${PN} += "/usr/bin/python3.13"

inherit rpm
