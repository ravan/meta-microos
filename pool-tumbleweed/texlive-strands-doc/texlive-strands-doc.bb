SUMMARY = "Documentation for texlive-strands"
DESCRIPTION = "This package includes the documentation for texlive-strands"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn59906"

RPM_NAME = "texlive-strands-doc-2026.226.1.1svn59906-64.2.noarch.rpm"
RPM_HASH = "b1013cb678b9f505171a9b65670a410559a474d171120b9422e9a6cdc3dac9729a36cc68b7cb11371b12eda676021a5f99b8936d38dacd631d93b38343c43f22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-strands-doc"

RDEPENDS:${PN} += ""

inherit rpm
