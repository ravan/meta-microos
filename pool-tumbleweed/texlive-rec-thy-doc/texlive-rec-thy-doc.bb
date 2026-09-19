SUMMARY = "Documentation for texlive-rec-thy"
DESCRIPTION = "This package includes the documentation for texlive-rec-thy"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.4.5svn76924"

RPM_NAME = "texlive-rec-thy-doc-2026.226.4.5svn76924-60.4.noarch.rpm"
RPM_HASH = "ffbd008dcbab423d7d86c277d18bcb28bc8f73b5f5f0f73d1d3461059202b9f09bfd9ce341378be33cd4e2e6412e7146bfe927e564a07fd6aef2c4cfaf86efc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rec-thy-doc"

RDEPENDS:${PN} += ""

inherit rpm
