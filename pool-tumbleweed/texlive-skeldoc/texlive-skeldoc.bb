SUMMARY = "Placeholders for unfinished documents"
DESCRIPTION = "This package lets you produce placeholder elements for \
documents under development, similar to the skeleton screens \
used while loading contents in many applications and websites. \
It also has a mechanism for attaching explanatory endnotes to \
these placeholders, or to anything else in your document. The \
same note mechanism can also be used with ordinary content, \
e.g., as a to-do mechanism."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1.3svn76924"

RPM_NAME = "texlive-skeldoc-2026.226.0.0.1.3svn76924-64.2.noarch.rpm"
RPM_HASH = "bfbb1b587e0e8e7e978f23a44b9422423d6c65e638bcf905d699124f6be2d89c3d555bcc0b4e6f3551f4947169ef0bdfbd4134a1d00de4a0c94b980dd9c6d4d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-skeldoc.sty \
texlive-skeldoc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-booktabs.sty \
tex-enotez.sty \
tex-enumitem.sty \
tex-expl3.sty \
tex-hyperref.sty \
tex-marginnote.sty \
tex-tabularx.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
