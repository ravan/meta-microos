SUMMARY = "Produce gaps that are underlined, dotted or dashed"
DESCRIPTION = "The package provides commands (\\underline, \\dotuline and \
\\dashuline) each of which underlines its argument with one of \
the styles the package is capable of. A phantom mode is \
provided, where the underline (of whatever form) can serve for \
a 'fill-in block' for student evaluation sheets."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0hsvn77682"

RPM_NAME = "texlive-dashundergaps-2026.226.2.0hsvn77682-61.2.noarch.rpm"
RPM_HASH = "83f0cef1001e4eb41c79fe3bd0911df8227f80fd9440ea34203534a3866a81e02a1faea4d3892a717e29608c8fe031e44b58935d4668fe7ec198db929726a19d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dashundergaps.sty \
texlive-dashundergaps"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-l3keys2e.sty \
tex-ulem.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
