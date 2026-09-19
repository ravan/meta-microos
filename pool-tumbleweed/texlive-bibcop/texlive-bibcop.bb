SUMMARY = "Style checker for .bib files"
DESCRIPTION = "This LaTeX package checks the quality of your .bib file and \
emits warning messages if any issues are found. For this, the \
TeX processor must be run with the --shell-escape option, and \
Perl must be installed. bibcop.pl can also be used as a \
standalone command line tool. The package does not work on \
Windows."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0.32svn75042"

RPM_NAME = "texlive-bibcop-2026.226.0.0.0.32svn75042-61.2.noarch.rpm"
RPM_HASH = "1fb3f7404aaee7b408e834f4cd02cc9e9b0ced480d252d6c19905cc387502f4fa9c3f6a8626faaceec6ce675c2c160858163af2adbf1b97add2e205cd333cbb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bibcop.sty \
texlive-bibcop"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-File--Basename \
perl-POSIX \
perl-strict \
perl-warnings \
sed \
tex-iexec.sty \
tex-pgfopts.sty \
tex-shellesc.sty \
texlive \
texlive-bibcop-bin \
texlive-filesystem \
texlive-iexec \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-pgfopts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
