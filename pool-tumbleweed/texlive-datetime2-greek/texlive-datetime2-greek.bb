SUMMARY = "Greek language module for the datetime2 package"
DESCRIPTION = "This module provides the 'greek' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. This package is \
currently unmaintained. Please see the README for the procedure \
to follow if you want to take over the maintenance."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn47533"

RPM_NAME = "texlive-datetime2-greek-2026.226.1.1svn47533-59.2.noarch.rpm"
RPM_HASH = "206cdb29feeaf554599e534071542c1eccdfc66598429c02b60017600465457c0a6495791678869f7dde3ee458793e770feb595543a73e1972f35151b06fed72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-greek-ascii.ldf \
tex-datetime2-greek-utf8.ldf \
tex-datetime2-greek.ldf \
texlive-datetime2-greek"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
