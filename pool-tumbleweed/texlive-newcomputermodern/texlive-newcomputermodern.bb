SUMMARY = "Computer Modern fonts including matching non-latin alphabets"
DESCRIPTION = "This is a new assembly of Computer Modern fonts including \
extensions in many directions for both Latin based languages, \
non-Latin based languages and Mathematics, all compatible in \
style to CM fonts. In addition to the Regular weight of \
Computer Modern, it provides a Book weight for heavier \
printing."
LICENSE = "LPPL-1.3c"

PV = "2026.226.7.1.1svn77682"

RPM_NAME = "texlive-newcomputermodern-2026.226.7.1.1svn77682-61.2.noarch.rpm"
RPM_HASH = "0d9d9ad05816980c89e56544f2283999ec9ef2ce20e0a013c32ba8943cd676289504a48eb74162b0c38051b49afc314e6073f0a2371a569409e9142109b54638"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-newcomputermodern.sty \
texlive-newcomputermodern"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
tex-fspdefault.tex \
tex-fspolddefault.tex \
tex-fspsansdefault.tex \
tex-unicode-math.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-newcomputermodern-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
