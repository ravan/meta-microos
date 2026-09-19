SUMMARY = "Execute foreign source code and embed the result in the pdf file"
DESCRIPTION = "This LaTeX package executes programming source codes (including \
all command line tools) from within LaTeX and embeds the output \
in the resulting .pdf file. Many programming languages can be \
easily used and any command-line executable can be invoked when \
preparing the .pdf file from a .tex file. It is however \
recommended to use this package in server-mode together with \
the Python talk2stat package. Currently, this server-mode \
supports Julia, MatLab, Python, and R. More languages will be \
added. For more details and usage examples, refer to the \
package's github repository."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.4svn73500"

RPM_NAME = "texlive-runcode-2026.226.2.4svn73500-60.2.noarch.rpm"
RPM_HASH = "eeb24d384b75ce7e463c068cd529a26e8eed1adf1c3f4308249160a65f345e300d764ffc3aad64bd7d5281a845150ed81b5c745617616d2dcb67a6fc01845c48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-runcode.sty \
texlive-runcode"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-forloop.sty \
tex-fvextra.sty \
tex-inputenc.sty \
tex-listings.sty \
tex-minted.sty \
tex-morewrites.sty \
tex-tcolorbox.sty \
tex-textgreek.sty \
tex-xcolor.sty \
tex-xifthen.sty \
tex-xparse.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
