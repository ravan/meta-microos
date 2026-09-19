SUMMARY = "Typeset git log information"
DESCRIPTION = "The program is run within a git repository, and outputs the \
entire version history, as a LaTeX table. That output will \
typically be redirected to a file; the author recommends \
typesetting in landscape orientation."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.1.0svn71402"

RPM_NAME = "texlive-latex-git-log-2026.226.1.1.0svn71402-63.2.noarch.rpm"
RPM_HASH = "5c9a837417d6aad5e0eded2ede7f2bcd5eff65e3034e25632c5326dd3951849bbc817360adad8574f3c58427bfa56d6ae8497d12e499829e2b4705693e928a59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-git-log"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Cwd \
perl-English \
perl-File--Basename \
perl-Getopt--Long \
perl-IPC--System--Simple \
perl-Locale--Maketext--Simple \
perl-Pod--Usage \
perl-autodie \
perl-feature \
perl-open \
perl-strict \
perl-utf8 \
perl-warnings \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-latex-git-log-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
