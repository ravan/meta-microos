SUMMARY = "Randomise token strings"
DESCRIPTION = "The package provides means of randomising lists of tokens, or \
lists of chunks of tokens. Two mechanisms for defining chunks \
are provided: the \\ranToks command accepts an argument \
containing tokens to be randomised; and the \\bRTVToks/\\eRTVToks \
commands delimit a collection of tokens for randomising; each \
group inside a rtVw constitutes one of these (typically larger) \
token sets."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn59515"

RPM_NAME = "texlive-ran_toks-2026.226.svn59515-60.4.noarch.rpm"
RPM_HASH = "40b4638da3404589f7f6bd07f079c26b30f8a3d0515fbdcff187590ecadcf379257b896da35778300b9896b9614cdac173535bd1476227e19866b10298f575b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ran-toks.sty \
tex-rt-dbapp.def \
texlive-ran-toks"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
