SUMMARY = "Provides a symbol set for describing relations between ordered pairs"
DESCRIPTION = "Around 2008, researcher Byron Cook and several colleagues began \
developing a new set of interrelated algorithms capable of \
automatically reasoning about the behavior of computer programs \
and other systems (such as biological systems, circuit designs, \
etc). At the center of these algorithms were new ideas about \
the relationships between structures expressible as \
mathematical sets and relations. Using the language of \
mathematics and logic, the researchers communicated these new \
results to others in their community via published papers, \
research talks, etc. Unfortunately, they found the symbols \
already available for reasoning about relations lacking (in \
contrast to sets, which have a long-ago developed and robust \
symbol vocabulary). Early presentations were unnecessarily \
cluttered. To more elegantly express these ideas around \
relations, Cook recruited artist Tauba Auerbach to help develop \
a set of symbols. This package provides an math symbol font for \
describing relations between ordered pairs by using Metafont."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn76924"

RPM_NAME = "texlive-esrelation-2026.226.svn76924-59.2.noarch.rpm"
RPM_HASH = "d58d0f17677142e5f15d5761c8c31f8c6915f843c71df03cb50232b5fbee0c9cbe7b933ba94d5bcb2bf7218c83e9564bd48ca81b86578a1aad60daa8d92c6622"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-esrelation.map \
tex-esrelation.sty \
tex-esrelation10.tfm \
tex-uesrelation.fd \
texlive-esrelation"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-updmap.cfg \
texlive \
texlive-esrelation-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
