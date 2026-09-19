SUMMARY = "Syntax highlighting for the Q# language"
DESCRIPTION = "The package provides syntax highlighting for the Q# language, a \
domain-specific language for quantum programming."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3.1901.1401svn49722"

RPM_NAME = "texlive-qsharp-2026.226.0.0.3.1901.1401svn49722-60.4.noarch.rpm"
RPM_HASH = "91701c19a8d4a6bc3b1cca665c91aad2df55f16b0a755d40876b92e4f6c6c518fce462082494330e7c2a2371f1c366236a8b71d2c89226cc94fc5d59d8d1ddc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-qsharp.sty \
texlive-qsharp"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-listings.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
