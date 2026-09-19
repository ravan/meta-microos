SUMMARY = "Simulation of modulation and demodulation"
DESCRIPTION = "The package allows the simulation of the modulated and \
demodulated amplitude of radio waves. The user may plot curves \
of modulated signals, wave carrier, signal modulation, signal \
recovery and signal demodulation."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.02svn19591"

RPM_NAME = "texlive-pst-am-2026.226.1.02svn19591-59.2.noarch.rpm"
RPM_HASH = "02f228c6455b9a109369c7fbf70ecdcb3f6a5735e013aa3c82055132c7f01873e5125c5f77fb940d4e9cc360b61e32215785c27092bd5cb3a3b200d9ce59121f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pst-am.sty \
texlive-pst-am"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-multido.sty \
tex-numprint.sty \
tex-pst-node.sty \
tex-pst-plot.sty \
tex-pst-xkey.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
