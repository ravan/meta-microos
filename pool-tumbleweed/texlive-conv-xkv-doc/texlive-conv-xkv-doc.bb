SUMMARY = "Documentation for texlive-conv-xkv"
DESCRIPTION = "This package includes the documentation for texlive-conv-xkv"
LICENSE = "LPPL-1.0"

PV = "2026.226.svn43558"

RPM_NAME = "texlive-conv-xkv-doc-2026.226.svn43558-61.2.noarch.rpm"
RPM_HASH = "87650d56777b1310edc07ef82948766e29743b694ddf32e5b44dd0781250f681d9136a92a7eece56c3ebf94198ee7d87d0fdccbcf177a9cb22842763939b0767"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-conv-xkv-doc"

RDEPENDS:${PN} += ""

inherit rpm
