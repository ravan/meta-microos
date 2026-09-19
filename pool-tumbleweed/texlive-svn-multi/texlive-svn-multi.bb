SUMMARY = "Subversion keywords in multi-file LaTeX documents"
DESCRIPTION = "This package lets you typeset keywords of the version control \
system Subversion inside your LaTeX files anywhere you like. \
Unlike the otherwise similar package svn the use of multiple \
files for one LaTeX document is well supported. The package \
uses the author's filehook and currfile packages. The package \
interacts with an external Perl script, to retrieve information \
necessary for the required output."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.4dsvn64967"

RPM_NAME = "texlive-svn-multi-2026.226.2.4dsvn64967-64.2.noarch.rpm"
RPM_HASH = "3597094d580ccbe8bbda87a435b6e57c34c8f0bf3a2e9a8173cf258800fd3a2043e92af686f7d46aab3cfed24b20f24f8f4278874148a9ddb95c736a0f99f538"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-svn-multi.sty \
tex-svnkw.sty \
texlive-svn-multi"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Date--Format \
perl-Date--Parse \
perl-File--Basename \
perl-strict \
perl-warnings \
sed \
tex-currfile.sty \
tex-filehook.sty \
tex-graphics.sty \
tex-kvoptions.sty \
tex-pgf.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-svn-multi-bin"

inherit rpm
