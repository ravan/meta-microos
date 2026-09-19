SUMMARY = "A fancy means of underlining"
DESCRIPTION = "The package combines the use of soul with the savepos mechanism \
of current pdfTeX so that the user can create (almost) \
arbitrary underlining and similar 'decorations', including \
rules, leaders and even pictures (pgf, pstricks, etc.). Unlike \
soul underlines, which are built by repeating small elements, \
here each chunk of text to be underlined is a single element."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn77682"

RPM_NAME = "texlive-soulpos-2026.226.1.2svn77682-64.2.noarch.rpm"
RPM_HASH = "98e29fdf9a69ab39b794d9742f6c0dc8bcae66332f85f3749d408af608c491f1909d653892bfdb11ff8f8b16c338911bb38f8b1323ecafa9bf46c7a31f702b96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-soulpos.sty \
texlive-soulpos"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-keyval.sty \
tex-soulutf8.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-oberdiek \
texlive-scripts \
texlive-scripts-bin \
texlive-soul"

inherit rpm
