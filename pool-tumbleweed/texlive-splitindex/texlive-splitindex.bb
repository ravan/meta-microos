SUMMARY = "Unlimited number of indexes"
DESCRIPTION = "SplitIndex consists of a LaTeX package, splitidx, and a small \
program, splitindex. The package may be used to produce one \
index or several indexes. Without splitindex (for example, \
using the index package), the number of indexes is limited by \
the number of TeX's output streams. But using the program you \
may use even more than 16 indexes: splitidx outputs only a \
single file \\jobname.idx and the program splits that file into \
several raw index files and calls your favorite index processor \
for each of the files."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2csvn77682"

RPM_NAME = "texlive-splitindex-2026.226.1.2csvn77682-64.2.noarch.rpm"
RPM_HASH = "9809dc0f410822c1f2c3d255e1e50932924f6a404513030dfdf5f27dd64b72e696cf3af3e523ec1a7be71c7e9cb02342082303243c2c2e7d95a90839c8472404"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-splitidx.sty \
tex-splitindex.tex \
texlive-splitindex"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
perl-Getopt--Long \
perl-strict \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-splitindex-bin"

inherit rpm
