SUMMARY = "Help gb4e, linguex, and covington users use the ExPex glossing macros"
DESCRIPTION = "The ExPex package by John Frampton provides very fine-grained \
control over glossing and example formatting, including \
unlimited gloss lines and various ways of formatting multiline \
glosses. By contrast the cgloss4e glossing macros provided with \
gb4e, linguex, and covington, although very capable at basic \
glossing, lack the degree of customization that is sometimes \
needed for more complex glossing. On the other hand, for those \
users who have heavily invested in using either gb4e or \
linguex, or covington, shifting to ExPex can be quite daunting \
and burdensome, especially since the basic syntax of the \
examples is quite different. This package is an attempt to have \
the best of both worlds: it allows gb4e, linguex and covington \
users to keep using those packages for basic example numbering \
and formatting, but also allows them to use the glossing macros \
that ExPex provides."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9bsvn69914"

RPM_NAME = "texlive-expex-glossonly-2026.226.0.0.9bsvn69914-59.2.noarch.rpm"
RPM_HASH = "53dd18e73bd5d07420f1784b7f6f5aafedc00c53a293ac994f03e10081b34fe466c62b7fb3d6ff4b3049e0fff604f4984285f075983adc68cf3c9add753f1f70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-expex-glossonly.sty \
texlive-expex-glossonly"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-covington.sty \
tex-expex.sty \
tex-gb4e.sty \
tex-linguex.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
