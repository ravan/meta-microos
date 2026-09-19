SUMMARY = "Documentation for texlive-barracuda"
DESCRIPTION = "This package includes the documentation for texlive-barracuda"
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.0.12svn63708"

RPM_NAME = "texlive-barracuda-doc-2026.226.0.0.0.12svn63708-60.2.noarch.rpm"
RPM_HASH = "c74a0769bb6c97697cb3270601021fa786cf00c2f363450c787f545da4a7df6bce30c876e57dae947435732f18554696d1172a9a1d2ab4182f7b5cd4dbf720a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-barracuda-doc"

RDEPENDS:${PN} += ""

inherit rpm
