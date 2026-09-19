SUMMARY = "Support for users uploading to CTAN"
DESCRIPTION = "The package provides a Perl script that allows the uploads of a \
contribution to CTAN from the command line. The aim is to \
simplify the release process for LaTeX package authors. Note by \
the CTAN team (2015-02-05): It seems that this script is \
currently not working."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.2csvn26313"

RPM_NAME = "texlive-ctanupload-2026.226.1.2csvn26313-61.2.noarch.rpm"
RPM_HASH = "49fbe6e98a5cc710784554174f5feb55a3b178042faeeea21aa14d4d052e70f7828b658b1d54e9a200c8c703b0a9f17fb037ac4707e079031b8e93592b38d170"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ctanupload"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-HTML--FormatText \
perl-HTML--TreeBuilder \
perl-WWW--Mechanize \
perl-strict \
perl-warnings \
sed \
texlive \
texlive-ctanupload-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
