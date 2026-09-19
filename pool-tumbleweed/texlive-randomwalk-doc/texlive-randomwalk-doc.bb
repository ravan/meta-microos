SUMMARY = "Documentation for texlive-randomwalk"
DESCRIPTION = "This package includes the documentation for texlive-randomwalk"
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.6svn76924"

RPM_NAME = "texlive-randomwalk-doc-2026.226.0.0.6svn76924-60.4.noarch.rpm"
RPM_HASH = "28c61ede3e5e8bd32a5fa042db9f0364bc43f2ece41b2eab7457e99ed6d7486ad7f7a2923362090ee090170949b8e01cd7aeed04afd4b180726388f596aaf487"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-randomwalk-doc"

RDEPENDS:${PN} += ""

inherit rpm
