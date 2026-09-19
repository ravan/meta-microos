SUMMARY = "Flexible ruler and annotation commands with key-value support and vertical writing compatibility"
DESCRIPTION = "This package provides a versatile set of commands for drawing \
rules and creating annotations in LaTeX. While standard LaTeX \
rules can be rigid, this package introduces more flexible \
alternatives: \\mruleth (horizontal rules), \\mruletv (vertical \
rules), and \\undernote (underlined annotations). Key Features: \
Key-Value Interface: All commands support a consistent \
key-value syntax for adjust dimensions (width, height, depth), \
colors, and dash patterns (dash, dash-len, gap-len). Underline \
Annotations: The \\undernote command allows users to attach \
descriptive notes to underlined text. It automatically handles \
positioning, spacing between multiple notes, and provides \
options for various border styles (solid or dashed boxes). \
Vertical Writing Compatibility: Designed with multilingual \
typesetting in mind, the package is compatible with vertical \
writing modes, ensuring that rules and notes are oriented \
correctly. Customization: Users can update package-wide dfaults \
at any point in the document using a dedicated set of \
\\SetUNote... commands."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.1.6svn77699"

RPM_NAME = "texlive-modernruler-2026.226.2.1.6svn77699-61.2.noarch.rpm"
RPM_HASH = "e1bee49848f4d7a707391b571f6afeae3c7f41b975ef59dc796f85332ebe422065f4da9bfcdbe6fcd19f8ed589402517b2dadfcb7cf4878a82e709aed9a3c8c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-modernruler.sty \
texlive-modernruler"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
tex-pgfkeys.sty \
tex-tcolorbox.sty \
tex-varwidth.sty \
tex-zref-savepos.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
