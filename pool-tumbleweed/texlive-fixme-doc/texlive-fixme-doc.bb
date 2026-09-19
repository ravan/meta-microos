SUMMARY = "Documentation for texlive-fixme"
DESCRIPTION = "This package includes the documentation for texlive-fixme"
LICENSE = "LPPL-1.0"

PV = "2026.226.4.5svn77682"

RPM_NAME = "texlive-fixme-doc-2026.226.4.5svn77682-59.2.noarch.rpm"
RPM_HASH = "c8af3dfb4cddfd52a74c24fbcbb209191398c4e0e9df3a77db261d330aaf2e290ed6510c19668d1dd608827dd6c4fee792b406c16e8286b161745b44bbddcb3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fixme-doc"

RDEPENDS:${PN} += ""

inherit rpm
