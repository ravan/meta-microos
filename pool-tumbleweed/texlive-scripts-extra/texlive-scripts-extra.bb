SUMMARY = "TeX Live scripts"
DESCRIPTION = "Miscellaneous scripts maintained as part of TeX Live, but not \
important for the infrastructure. Thus, this is not part of \
scheme-infraonly or tlcritical, just a normal package."
LICENSE = "LPPL-1.0"

PV = "2026.227.svn78162"

RPM_NAME = "texlive-scripts-extra-2026.227.svn78162-62.2.noarch.rpm"
RPM_HASH = "9935a24573ad4695ba7f48f58cd9f27a7f9df85c9fdc51cabe6c84dcc3400f30f5ec218691ce40d527937aded427c6baa56f29b7ec0f1af25b53bdd2bd3c8718"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tcfmgr.map \
texlive-scripts-extra \
texlive-texconfig-/usr/share/texmf/texconfig/README \
texlive-texconfig-/usr/share/texmf/texconfig/tcfmgr \
texlive-texconfig-/usr/share/texmf/texconfig/tcfmgr.map"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
terminfo-base \
tex-psfrag.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-scripts-extra-bin"

inherit rpm
