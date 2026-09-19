SUMMARY = "Input encodings, font encodings and font definition files for Hebrew"
DESCRIPTION = "A collection of input encodings, font encodings and font \
definition files for the Hebrew language."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.3svn68038"

RPM_NAME = "texlive-hebrew-fonts-2026.226.1.3svn68038-60.4.noarch.rpm"
RPM_HASH = "934bd107c4819a5f1e06e88787e7173c6f28fb51615b90574dbb34503df66e0434caac5d191d2a027e229fbfc9148a0e1b4c5371f8da93e0a16bd8fbf52a5190"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-8859-8.def \
tex-cp1255.def \
tex-cp862.def \
tex-he8enc.def \
tex-he8omegahebrew.fd \
tex-hebfont.sty \
tex-lheclas.fd \
tex-lhecmr.fd \
tex-lhecmss.fd \
tex-lhecmtt.fd \
tex-lhecrml.fd \
tex-lheenc.def \
tex-lhefr.fd \
tex-lheredis.fd \
tex-lheshold.fd \
tex-lheshscr.fd \
tex-lheshstk.fd \
tex-nhe8enc.def \
tex-si960.def \
texlive-hebrew-fonts"

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
