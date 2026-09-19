SUMMARY = "Easy access to package documentation"
DESCRIPTION = "A Perl/Tk-based GUI for easy access to package documentation \
for TeX on Unix platforms; the databases it uses are based on \
the texmf/doc subtrees of teTeX, but database files for local \
configurations with modified/extended directories can be \
derived from them. Note that texdoctk is not a viewer itself, \
but an interface for finding documentation files and opening \
them with the appropriate viewer; so it relies on appropriate \
programs to be installed on the system. However, the choice of \
these programs can be configured by the sysadmin or user. Now \
only distributed as part of TeX Live, which includes a Windows \
executable."
LICENSE = "GPL-2.0-or-later"

PV = "2026.227.0.0.6.0svn62186"

RPM_NAME = "texlive-texdoctk-2026.227.0.0.6.0svn62186-62.2.noarch.rpm"
RPM_HASH = "ffcb75f5914f3d6262f8462ea1e57e2b27fe383244877fd61ad46a6075bf1b030ac5c49c545e61f091ef307f67b7d750519b7d4b22350882b09f77bafff22b42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-texdoctk.dat \
texlive-texdoctk"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-File--Basename \
perl-File--Copy \
perl-Getopt--Long \
perl-strict \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-texdoctk-bin"

inherit rpm
