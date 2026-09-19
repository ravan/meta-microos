SUMMARY = "Czech/Slovak"
DESCRIPTION = "Support for Czech/Slovak."
LICENSE = "LPPL-1.0"

PV = "2026.222.svn54074"

RPM_NAME = "texlive-collection-langczechslovak-2026.222.svn54074-68.2.noarch.rpm"
RPM_HASH = "ddec739b7548c018fccdc9a7d5d768da10d7a64e080dccd4bfaf317e82700d88d4fd16d30cffb51a4d8d5262c0d6ddca58696106f4613f6dc50249ae42068f71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
tex-czechslovak \
texlive-collection-langczechslovak"

RDEPENDS:${PN} += "texlive-babel-czech \
texlive-babel-slovak \
texlive-cnbwp \
texlive-collection-basic \
texlive-collection-latex \
texlive-cs \
texlive-csbulletin \
texlive-cslatex \
texlive-csplain \
texlive-cstex \
texlive-hyphen-czech \
texlive-hyphen-slovak \
texlive-lshort-czech \
texlive-lshort-slovak \
texlive-texlive-cz \
texlive-vlna"

inherit rpm
