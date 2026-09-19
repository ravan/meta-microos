SUMMARY = "Control over the typesetting of the \\maketitle command"
DESCRIPTION = "The titling package provides control over the typesetting of \
the \\maketitle command and \\thanks commands, and makes the \
\\title, \\author and \\date information permanently available. \
Multiple titles are allowed in a single document. New titling \
elements can be added and a titlepage title can be centered on \
a physical page."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1dsvn77682"

RPM_NAME = "texlive-titling-2026.226.2.1dsvn77682-59.2.noarch.rpm"
RPM_HASH = "927a83b394c43266986c09918df2b65d697644fd1d440d1e069ee7b19f0d77a5853e37f815d8d2095a1dc5f80c98cb96926cedebc7d80a63050c6a3105b2dcf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-titling.sty \
texlive-titling"

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
