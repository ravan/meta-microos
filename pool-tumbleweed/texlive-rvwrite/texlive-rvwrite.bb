SUMMARY = "Increase the number of available output streams in LaTeX"
DESCRIPTION = "The package addresses, for LaTeX documents, the severe \
limitation on the number of output streams that TeX provides. \
The package uses a single TeX output stream, and writes \
'marked-up' output to this stream. The user may then \
post-process the marked-up output file, using LaTeX, and the \
document's output appears as separate files, according to the \
calls made to the package. The output to be post-processed uses \
macros from the widely-available ProTeX package."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.2svn19614"

RPM_NAME = "texlive-rvwrite-2026.226.1.2svn19614-60.2.noarch.rpm"
RPM_HASH = "b96ba3078baf979d2752550871da11df1db9209fda0b2f4cea99e64c156756c1873064771ad4a77d18817384a00fc17b86cd188444261391b4e60f8fa3803e19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-rvwrite.sty \
texlive-rvwrite"

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
