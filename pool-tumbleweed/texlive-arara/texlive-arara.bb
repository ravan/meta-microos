SUMMARY = "Automation of LaTeX compilation"
DESCRIPTION = "Arara is comparable with other well-known compilation tools \
like latexmk and rubber. The key difference is that arara \
determines its actions from metadata in the source code, rather \
than relying on indirect resources, such as log file analysis. \
Arara requires a Java virtual machine."
LICENSE = "BSD-3-Clause"

PV = "2026.226.7.2.0svn75653"

RPM_NAME = "texlive-arara-2026.226.7.2.0svn75653-61.2.noarch.rpm"
RPM_HASH = "83de08f2566954b3c1bad01c4e3244d6557bfa43ea033dc6f798125d5bf61d636ce72bc58907f3c498bd73223f9ef2f6faa748c38af46ba32612703b48070a72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-arara.jar \
texlive-arara"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
java \
sed \
texlive \
texlive-arara-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
