SUMMARY = "Support for end-notes"
DESCRIPTION = "The package allows nested endnotes, supports hyperref and \
provides means for easy customization of the list of notes. The \
package requires the expl3 bundle and packages from the LaTeX 3 \
'package set'."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.10dsvn77682"

RPM_NAME = "texlive-enotez-2026.226.0.0.10dsvn77682-61.4.noarch.rpm"
RPM_HASH = "0963dd4819538be9ea0764c3f27d19cd6a31107bd0027f7d913fddbbf898e98e990e885f15268d4a869707a2b42da94475d7dbe9ae014033b951d3ef6de32b14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-enotez.sty \
texlive-enotez"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-translations.sty \
tex-xparse.sty \
tex-xtemplate.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
