SUMMARY = "Facilitate optional printing of parts of a document"
DESCRIPTION = "Optional provides simple, flexible, optional compilation of \
LaTeX documents. Option switches may be given via package \
options, by the \\UseOption command, or interactively via the \
\\AskOption command (help text may be provided, by defining the \
\\ExplainOptions command). The package is not robust, in the way \
that comment package is, against ill-behaved text. In \
particular, verbatim text may not be directly included in \
optional sections (whether they're included or not)."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.2bsvn77682"

RPM_NAME = "texlive-optional-2026.226.2.2bsvn77682-61.2.noarch.rpm"
RPM_HASH = "ac79f74da32297e62367d24ee561ce63a9e334aa219f05bda5315857ddaca883d6ec2513bce73af9bc68cbfbf85c6142db056793fb8df28b5e33440cbfce1ade"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-optional.sty \
texlive-optional"

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
