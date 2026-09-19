SUMMARY = "Filter LaTeX engines output or log file"
DESCRIPTION = "texlogfilter is a Perl script designed to filter LaTeX engines \
output or log file (LaTeX, pdfLaTeX, LuaLaTeX or XeLaTeX). It \
reduces the LaTeX output or log to keep only warnings and \
errors. The result is colorised. Options allow to mask specific \
warnings, such as box or references/citations warnings. It's \
also possible to add custom filter patterns."
LICENSE = "LPPL-1.0"

PV = "2026.227.1.4svn71525"

RPM_NAME = "texlive-texlogfilter-2026.227.1.4svn71525-62.2.noarch.rpm"
RPM_HASH = "b1eb23eb9d2e94a795ea6e4cc974e191a247c6f827c4d451b16ad370df9a5514b785aa5b9cfb6e62891329ffdba744e83ad6f58761af8226cbd9449f0a498190"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texlogfilter"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Getopt--Long \
perl-Term--ANSIColor \
perl-strict \
perl-warnings \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-texlogfilter-bin"

inherit rpm
