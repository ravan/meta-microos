SUMMARY = "Serbian language module for the datetime2 package"
DESCRIPTION = "This module provides the 'serbian' style that can be set using \
\\DTMsetstyle provided by datetime2.sty. It provides both \
Cyrillic and Latin, Ekavian and Ijekavian variants of Serbian \
date formats, regionalized and non-regionalized."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1.0svn67201"

RPM_NAME = "texlive-datetime2-serbian-2026.226.2.1.0svn67201-59.2.noarch.rpm"
RPM_HASH = "18596ac9e32f5e0a525c1fa1d476acb1b35309014c5f75ee2a592c694b2941576218c3766203338858dcb20ce2a672a886e28f8832ab378b7f196f49aeedca59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-serbian-base-ascii.ldf \
tex-datetime2-serbian-base-utf8.ldf \
tex-datetime2-serbian-base.ldf \
tex-datetime2-serbian.ldf \
tex-datetime2-serbianc.ldf \
tex-datetime2-sr-Cyrl-BA.ldf \
tex-datetime2-sr-Cyrl-ME.ldf \
tex-datetime2-sr-Cyrl-RS.ldf \
tex-datetime2-sr-Cyrl.ldf \
tex-datetime2-sr-Latn-BA.ldf \
tex-datetime2-sr-Latn-ME.ldf \
tex-datetime2-sr-Latn-RS.ldf \
tex-datetime2-sr-Latn.ldf \
texlive-datetime2-serbian"

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
