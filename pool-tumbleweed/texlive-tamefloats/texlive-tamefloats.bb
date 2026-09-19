SUMMARY = "Experimentally use \\holdinginserts with LaTeX floats"
DESCRIPTION = "LaTeX's figures, tables, and \\marginpars are dangerous for \
footnotes (and probably also \\enlargethispage). Here is a \
proposal (a 'patch' package) to help, by using \\holdinginserts \
in a simple way. It replaces the original problem with a new \
one -- it is an experiment to find out whether the new problem \
is less bad (or it is just a contribution to the discussion, \
maybe just a summary of previous work). The files provide \
further information."
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.42svn27345"

RPM_NAME = "texlive-tamefloats-2026.227.0.0.42svn27345-62.2.noarch.rpm"
RPM_HASH = "0742e080ff17a357fcaa0ab49829212bc8dcea7efaebc673d4e3ede7bc0a81414e0f1106078979b67b9129922f99fc41dd7edeaa2977c58c67862cfb9069caa6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tameflts.sty \
texlive-tamefloats"

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
