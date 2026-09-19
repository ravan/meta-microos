SUMMARY = "Perl interface to mfpic"
DESCRIPTION = "mkpic provides an easy interface for making small pictures with \
mfpic. To this end you create an input file consisting of \
commands, one per line, with space separated parameters (or you \
modify the DATA section of the mkpic script, which is used if \
you run it without an input file). For an extensive description \
see the file mkpicdoc.pdf, which is part of the distribution."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.03svn76483"

RPM_NAME = "texlive-mkpic-2026.226.1.03svn76483-61.2.noarch.rpm"
RPM_HASH = "7bf7c38945feede142792753bb23683fb537345113282bfea33a333cd847093228fbfff21df72d4372ffb0e71325addf28754c21651310a52f76de2991ebd03b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mkpic"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Getopt--Long \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-mkpic-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
