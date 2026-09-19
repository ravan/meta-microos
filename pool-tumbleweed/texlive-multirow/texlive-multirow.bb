SUMMARY = "Create tabular cells spanning multiple rows"
DESCRIPTION = "The package has a lot of flexibility, including an option for \
specifying an entry at the 'natural' width of its text. The \
package is distributed with the bigdelim and bigstrut packages, \
which can be used to advantage with \\multirow cells."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.9svn77682"

RPM_NAME = "texlive-multirow-2026.226.2.9svn77682-61.2.noarch.rpm"
RPM_HASH = "eee00cb44338c3b2b4a4467331b57e4e5a69932c2de068238099ab6e5e7ad88021c2886d8ad07cda63d4ccbf47a8f9e500ce8e9b44287412bc9e93d6ddd522b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bigdelim.sty \
tex-bigstrut.sty \
tex-multirow.sty \
texlive-multirow"

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
