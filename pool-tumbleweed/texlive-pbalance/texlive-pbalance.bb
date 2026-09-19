SUMMARY = "Balance last page in two-column mode"
DESCRIPTION = "This package balances the columns on the last page of a \
two-column document. If the page is 'simple' (no footnotes, \
floats, or marginpars), is uses the balance package; otherwise, \
it uses \\enlargethispage to make the left column shorter, \
balancing the columns."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4.0svn67201"

RPM_NAME = "texlive-pbalance-2026.226.1.4.0svn67201-58.2.noarch.rpm"
RPM_HASH = "8a4fc2b1a052b1cbf1f10d72abc6ee30fbe9d71d4c6b9fea93772225ffb4d50074e6d5f10c9d006cfb9494adb742f003107828802273ef26482bd943499e609f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pbalance.sty \
texlive-pbalance"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atbegshi.sty \
tex-atveryend.sty \
tex-balance.sty \
tex-etoolbox.sty \
tex-expl3.sty \
tex-filehook.sty \
tex-zref-abspage.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
