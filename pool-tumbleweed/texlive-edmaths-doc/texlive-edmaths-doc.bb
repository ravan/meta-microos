SUMMARY = "Documentation for texlive-edmaths"
DESCRIPTION = "This package includes the documentation for texlive-edmaths"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.0svn77050"

RPM_NAME = "texlive-edmaths-doc-2026.226.1.0.0svn77050-61.4.noarch.rpm"
RPM_HASH = "edbdc554313d16ef90e4fa80d5e3a1512cd7a58cfe925cd0cbdd2b4e6c73b03ccadc0296768ef39ca014e9fd8c9395bc075aba66bb419a0b19559a08d144f987"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-edmaths-doc"

RDEPENDS:${PN} += ""

inherit rpm
