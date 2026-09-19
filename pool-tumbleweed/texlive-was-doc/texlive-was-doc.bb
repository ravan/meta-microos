SUMMARY = "Documentation for texlive-was"
DESCRIPTION = "This package includes the documentation for texlive-was"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn64691"

RPM_NAME = "texlive-was-doc-2026.226.svn64691-60.2.noarch.rpm"
RPM_HASH = "db71e658fd5b8536ee268c99d333b47ec6acf45c3999108b6e7277be986c5378c77a2c1e2ef5685b60d499dc79e3ed3dd51cf54a748ce33d8eb360e1261d00e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-was-doc"

RDEPENDS:${PN} += ""

inherit rpm
