SUMMARY = "Analyse TeX logs"
DESCRIPTION = "This perl script allows the user to extract (and display) \
elements of the log file."
LICENSE = "BSD-3-Clause"

PV = "2026.227.0.0.11svn54526"

RPM_NAME = "texlive-texloganalyser-2026.227.0.0.11svn54526-62.2.noarch.rpm"
RPM_HASH = "d30bdeb71364b4364187f1d4ef096d4a85efec6299585cd0f5f3d106b3d8eb5f535701952cbc417de59b7d30cb91e001c1a3bb475f26f5445061485201c249a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texloganalyser"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Getopt--Long \
perl-strict \
perl-warnings \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-texloganalyser-bin"

inherit rpm
