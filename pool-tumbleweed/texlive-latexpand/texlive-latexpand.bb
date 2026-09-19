SUMMARY = "Expand \\input and \\include in a LaTeX document"
DESCRIPTION = "Latexpand is a Perl script that simply replaces \\input and \
\\include commands with the content of the input or included \
file. The script does not deal with \\includeonly commands."
LICENSE = "BSD-3-Clause"

PV = "2026.226.1.7.2svn66226"

RPM_NAME = "texlive-latexpand-2026.226.1.7.2svn66226-61.2.noarch.rpm"
RPM_HASH = "b71b24de7db27f642ff231f78166d612bcb4cecd98fd9944c8a810c4750d17422e3babd918c432aaefbe0f2b3766214ca606248dec294c0b4172e1bb16488aab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexpand"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Cwd \
perl-File--Spec \
perl-Getopt--Long \
perl-IO--Handle \
perl-open \
perl-strict \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-latexpand-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
