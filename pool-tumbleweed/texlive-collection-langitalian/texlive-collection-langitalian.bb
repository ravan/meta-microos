SUMMARY = "Italian"
DESCRIPTION = "Support for Italian."
LICENSE = "LPPL-1.0"

PV = "2026.222.svn72943"

RPM_NAME = "texlive-collection-langitalian-2026.222.svn72943-68.2.noarch.rpm"
RPM_HASH = "e8fe78f8528a8822898bf1189f44491b7d560b5ce88a79051521579ac1faa2280d6c29c19d53f26602d0c70f6b4fb210debd8d4b9cdc1bdf28009c35b7d3aede"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
tex-italian \
texlive-collection-langitalian"

RDEPENDS:${PN} += "texlive-amsldoc-it \
texlive-amsmath-it \
texlive-amsthdoc-it \
texlive-antanilipsum \
texlive-babel-italian \
texlive-biblatex-accursius \
texlive-codicefiscaleitaliano \
texlive-collection-basic \
texlive-fancyhdr-it \
texlive-fixltxhyph \
texlive-frontespizio \
texlive-hyphen-italian \
texlive-itnumpar \
texlive-l2tabu-italian \
texlive-latex4wp-it \
texlive-layaureo \
texlive-lshort-italian \
texlive-psfrag-italian \
texlive-texlive-it \
texlive-verifica"

inherit rpm
