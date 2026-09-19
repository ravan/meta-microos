SUMMARY = "LaTeX support for documents written in Peano's Interlingua"
DESCRIPTION = "Latino sine Flexione (or Interlingua) is a language constructed \
by Giuseppe Peano at the beginning of the last century. This \
simplified Latin is designed to be an instrument for \
international cooperation, especially in the academic sphere. \
(Note that this 'Interlingua' is different from the \
'Interlingua' that was created a few decades after Peano's work \
and which is supported by babel-interlingua!) This package \
provides the necessary translations to use the language within \
a LaTeX document. It also imports fontenc in order to be able \
to use ligatures and quotation marks. Finally, it offers a text \
in Interlingua that can be used as a dummy text: Fundamento de \
intelligentia. This article by H. Bijlsma was first published \
in Schola et Vita Anno I (1926)."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.1.2svn69568"

RPM_NAME = "texlive-latino-sine-flexione-2026.226.1.2svn69568-61.2.noarch.rpm"
RPM_HASH = "fb8f45a95d015debb0740c6b4e21c5982a1b56661d698c0bb600437931e2219a4b895b1182478b56c7cbba2c7d12473edbaec54460103f6fcb3cb0e6c34e2b6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-latino-sine-flexione.sty \
texlive-latino-sine-flexione"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-datetime.sty \
tex-fontenc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
