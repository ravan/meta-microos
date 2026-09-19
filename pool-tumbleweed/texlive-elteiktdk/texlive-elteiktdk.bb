SUMMARY = "TDK-thesis template for Hungarian TDK conferences, Section of Computer Science"
DESCRIPTION = "The National Conference of Scientific Students Associations \
(OTDK) of Hungary is the most significant scientific event for \
Bachelor and Master students in the country, where students \
compete with their research papers in all field of science. It \
is organized in every 2 years. The conference/competition has 2 \
rounds: a university level and a country level (for the best \
papers). This class template enforces the required formatting \
rules for TDK theses and generates the cover and title page \
given on the provided metadata. The formatting rules are \
defined to meet the requirements for TDK theses submitted at \
the Eotvos Lorand University, Faculty of Informatics (Budapest, \
Hungary). This also fits the formatting requirements of the \
Computer Science Section of the country level round. With \
sufficient modifications the template could be usable for TDK \
theses at other national and faculty level sections, too. The \
template supports producing both Hungarian and English theses."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1svn71086"

RPM_NAME = "texlive-elteiktdk-2026.226.2.1svn71086-61.4.noarch.rpm"
RPM_HASH = "5b5d4630abe214993dcfe3743c3341fc35d2a58914df7d334bcc7d7cc1bb7177fc03c743ad588dbd89b42acb63328560ef92d719b161e56c8b6f77a3f2181305"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-elteiktdk.cls \
texlive-elteiktdk"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-mathptmx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
