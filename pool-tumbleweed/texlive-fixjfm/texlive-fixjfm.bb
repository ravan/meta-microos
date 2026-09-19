SUMMARY = "Fix JFM (for *pTeX)"
DESCRIPTION = "This package fixes several bugs in the JFM format. Both LaTeX \
and plain TeX are supported."
LICENSE = "SUSE-TeX"

PV = "2026.226.0.0.8svn77682"

RPM_NAME = "texlive-fixjfm-2026.226.0.0.8svn77682-59.2.noarch.rpm"
RPM_HASH = "d97a01ae0d5b7829f8379d26ebd022428fd66053e068955dfd209d48270f553f653642a68f13193ebb61f38ddef39f9ad336eb58513068020d888fea5d931577"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fixjfm.sty \
texlive-fixjfm"

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
