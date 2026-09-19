SUMMARY = "Documentation for texlive-collref"
DESCRIPTION = "This package includes the documentation for texlive-collref"
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0.4svn77682"

RPM_NAME = "texlive-collref-doc-2026.226.2.0.4svn77682-60.2.noarch.rpm"
RPM_HASH = "195c28ddd3f455dfb2488158eb76d597ed0d9e81675ead65002805af031ad762f16781fa08f4494bd7a47a4402a3b4cceafe214c17f5f4d4fcc6d04fcd63c64f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collref-doc"

RDEPENDS:${PN} += ""

inherit rpm
