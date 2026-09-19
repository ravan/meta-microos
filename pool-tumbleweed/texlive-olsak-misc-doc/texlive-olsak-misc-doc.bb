SUMMARY = "Documentation for texlive-olsak-misc"
DESCRIPTION = "This package includes the documentation for texlive-olsak-misc"
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.apr._2025svn74906"

RPM_NAME = "texlive-olsak-misc-doc-2026.226.apr._2025svn74906-61.2.noarch.rpm"
RPM_HASH = "dd41bd5dcc029687001779d0a065f067e6946053be20a58bd8a178a9599466e5d2e845ec544685b47022badf3a1aa485c4fce39a1d50a497d8c3eca41bb5973b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-olsak-misc-doc"

RDEPENDS:${PN} += ""

inherit rpm
