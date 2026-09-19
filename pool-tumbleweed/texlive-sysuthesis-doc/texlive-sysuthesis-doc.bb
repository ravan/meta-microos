SUMMARY = "Documentation for texlive-sysuthesis"
DESCRIPTION = "This package includes the documentation for texlive-sysuthesis"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn77646"

RPM_NAME = "texlive-sysuthesis-doc-2026.226.1.0.0svn77646-64.2.noarch.rpm"
RPM_HASH = "b9b8542bb4f64e45557010b6b4762518c2aecbbcc5fd5c5ddc308f7e9e5c82ee7fc54fdc9f78cbba391499f49d9970047413a5e996afaeff8d9252e21b811eea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-sysuthesis-doc-zh \
texlive-sysuthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
