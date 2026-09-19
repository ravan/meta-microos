SUMMARY = "English language module for the datetime2 package"
DESCRIPTION = "This module provides the following styles that can be set using \
\\DTMsetstyle provided by datetime2.sty. The region not only \
determines the date/time format but also the time zone \
abbreviations if the zone mapping setting is on. english \
(English - no region) en-GB (English - United Kingdom of Great \
Britain and Northern Ireland) en-US (English - United States of \
America) en-CA (English - Canada) en-AU (English - Commonwealth \
of Australia) en-NZ (English - New Zealand) en-GG (English - \
Bailiwick of Guernsey) en-JE (English - Bailiwick of Jersey) \
en-IM (English - Isle of Man) en-MT (English - Republic of \
Malta) en-IE (English - Republic of Ireland)"
LICENSE = "LPPL-1.0"

PV = "2026.226.1.05svn52479"

RPM_NAME = "texlive-datetime2-english-2026.226.1.05svn52479-59.2.noarch.rpm"
RPM_HASH = "abd25d8b4fa405f263b7075fe05a093fa4bb8e3384b099f7d510c116c8c7624b45493b373830aa7c7e22bd36c28c44d73b6a9985a5fac77b762ca435ad58f85a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-datetime2-en-AU.ldf \
tex-datetime2-en-CA.ldf \
tex-datetime2-en-GB.ldf \
tex-datetime2-en-GG.ldf \
tex-datetime2-en-IE.ldf \
tex-datetime2-en-IM.ldf \
tex-datetime2-en-JE.ldf \
tex-datetime2-en-MT.ldf \
tex-datetime2-en-NZ.ldf \
tex-datetime2-en-US.ldf \
tex-datetime2-english-base.ldf \
tex-datetime2-english.ldf \
texlive-datetime2-english"

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
