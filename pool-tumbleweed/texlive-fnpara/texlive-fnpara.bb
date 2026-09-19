SUMMARY = "Footnotes in paragraphs"
DESCRIPTION = "Typeset footnotes in run-on paragraphs, instead of one above \
another; this is a re-seating, for the LaTeX environment, of an \
example in the TeXbook. The same basic code, improved for use \
in e-TeX-based LaTeX, appears in the comprehensive footnote \
package footmisc, and superior versions are also available in \
the manyfoot and bigfoot packages."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn25607"

RPM_NAME = "texlive-fnpara-2026.226.svn25607-60.2.noarch.rpm"
RPM_HASH = "d16100a086519ea7f1d968a3ac5a55ad3eb6f6a9cd03293d6e70c195389d9e91d5d691326fcec9157fc658f3cfb44942fe7d7a0714029cd28244767a6ddb4246"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fnpara.sty \
texlive-fnpara"

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
