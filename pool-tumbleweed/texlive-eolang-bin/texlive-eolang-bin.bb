SUMMARY = "Binary files of eolang"
DESCRIPTION = "Binary files of eolang"
LICENSE = "LPPL-1.0"

PV = "2026.20260301.svn69391"

RPM_NAME = "texlive-eolang-bin-2026.20260301.svn69391-120.4.aarch64.rpm"
RPM_HASH = "7342abc8ef7b458cb3fb4311c0a8f93a8a6940ed1d664bf4f2a2a91e8c7b0ed4b620e34cec6f9ddab81f41e1bdc855df743e6fc806f7c3f17c30366a40c37da0"

RPROVIDES:${PN} += "texlive-eolang-bin"

RDEPENDS:${PN} += "texlive-eolang"

inherit rpm
