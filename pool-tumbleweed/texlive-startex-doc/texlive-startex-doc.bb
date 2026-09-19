SUMMARY = "Documentation for texlive-startex"
DESCRIPTION = "This package includes the documentation for texlive-startex"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.04svn69742"

RPM_NAME = "texlive-startex-doc-2026.226.1.04svn69742-64.2.noarch.rpm"
RPM_HASH = "9b95ce5f0f144b8d814c99b95032761b927bb1187fbc7764f0261ad84e1fe77806ba0fa35d3372715ac9f5479c99d18277c4591a44105c24f384abde986f3be8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-startex-doc"

RDEPENDS:${PN} += ""

inherit rpm
