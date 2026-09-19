SUMMARY = "A thesis class file for the Faculte de genie at the Universite de Sherbrooke"
DESCRIPTION = "The udes-genie-these class can be used for Ph.D. theses, \
master's theses and project definitions at the Faculte de genie \
of the Universite de Sherbrooke (Quebec, Canada). The class \
file is coherent with the latest version of the Protocole de \
redaction aux etudes superieures which is available on the \
faculte's intranet. The class file documentation is in French, \
the language of the typical user at the Universite de \
Sherbrooke. An example of use is also distributed with the \
documentation."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.1.0svn68141"

RPM_NAME = "texlive-udes-genie-these-2026.226.3.1.0svn68141-60.2.noarch.rpm"
RPM_HASH = "29f24dd691607de89e6aa8a6c2021d338abb641675bbef95b5651b7ee0b1dc64602e61a56061bb64fbfe2e041fa5b6fbb9d791c2cc223f089c8548df7455d198"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-udes-genie-these.cls \
texlive-udes-genie-these"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-book.cls \
tex-caption.sty \
tex-fancyhdr.sty \
tex-flafter.sty \
tex-geometry.sty \
tex-parskip.sty \
tex-setspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
