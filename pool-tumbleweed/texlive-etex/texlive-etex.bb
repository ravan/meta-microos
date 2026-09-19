SUMMARY = "An extended version of TeX, from the NTS project"
DESCRIPTION = "An extended version of TeX (capable of running as if it were \
unmodified TeX). E-TeX has been specified by the LaTeX team as \
the base engine for LaTeX2e. Thus, LaTeX programmers may assume \
e-TeX functionality, along with additional extensions. The \
pdftex engine and others directly incorporate the e-TeX \
extensions. The etex program in most distributions is an \
incarnation of pdftex running in DVI mode. The development \
source for e-TeX is the TeX Live source repository, although \
further extensions have taken place in the pdftex and other \
engine sources, keeping e-TeX stable."
LICENSE = "SUSE-TeX"

PV = "2026.226.svn77830"

RPM_NAME = "texlive-etex-2026.226.svn77830-59.2.noarch.rpm"
RPM_HASH = "c4ab10290291d9e48fdecf0afb579c4fecdbaf8baea8996a65c0e33149282680d90d0465a76db9a958e0afa88bf24000440b59901fc998cd0e4ee601ba8e1ced"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xbmc10.tfm \
texlive-etex"

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
