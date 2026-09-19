SUMMARY = "Read an environment verbatim"
DESCRIPTION = "This package allows you to collect the contents of an \
environment verbatim, and provides that inside the macro \
\\enverbBody. What you then do with that content is up to you. \
It also allows you to place arbitrary content at the start and \
end of each line (which doesn't have to be verbatim). The two \
convenience macros \\enverbExecute and \\enverbListings can be \
used to typeset the contents and wrap the contents inside \
another verbatim environment, respectively."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn76924"

RPM_NAME = "texlive-enverb-2026.226.1.1svn76924-61.4.noarch.rpm"
RPM_HASH = "dbf085850d1d4bde9c902880f2b72161ff4c9e6c7bf15b300880d87871199bc796fe3e99f16664534edee59ebeabe6fff6e53633db8f83dabe0584595a332314"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-enverb.sty \
texlive-enverb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expkv-def.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
