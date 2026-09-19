SUMMARY = "Metafont Phonetic fonts, based on Computer Modern"
DESCRIPTION = "The fonts are based on Computer Modern, and specified in \
Metafont. Macros for the fonts' use are provided, both for \
LaTeX 2.09 and for current LaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn56468"

RPM_NAME = "texlive-phonetic-2026.226.svn56468-58.2.noarch.rpm"
RPM_HASH = "d1d9dc1067faded7f29610ef2e6945b196bf7f961201dd57953d2208870a722a28a8e408697794afc9a0141f0564c4aa25069063ec1a9da426939caec5006f2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-Uphon.fd \
tex-cmph10.tfm \
tex-cmph5.tfm \
tex-cmph6.tfm \
tex-cmph7.tfm \
tex-cmph8.tfm \
tex-cmph9.tfm \
tex-cmphb10.tfm \
tex-cmphi10.tfm \
tex-cmphi7.tfm \
tex-cmphi8.tfm \
tex-cmphi9.tfm \
tex-phonetic.sty \
texlive-phonetic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
