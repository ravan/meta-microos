SUMMARY = "Visualise the vocal tract using LaTeX and PSTricks"
DESCRIPTION = "The package enables the user to visualise the vocal tract. The \
vocal tract (in the package) is manipulated by a vector of \
articulation parameters according to the S. Maeda model. \
Animation may be achieved by providing a sequence of vectors \
over time (e.g., from Matlab). A sequence of vectors for \
certain German phonemes is embedded in the package, which \
allows for animation when no other vector is available. The \
package's graphics are produced using pstricks."
LICENSE = "LPPL-1.0"

PV = "2026.226.1svn25629"

RPM_NAME = "texlive-vocaltract-2026.226.1svn25629-60.2.noarch.rpm"
RPM_HASH = "a8c001cb48dbf8c1ee98ac154b786f0ee94ff51d48edbcda69ec6d01f284b2497ae782f9fe6242880603971e51f408bf8621234b66b29f7b0d50fca95b76302a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-VocalTract.sty \
texlive-vocaltract"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-animate.sty \
tex-arrayjob.sty \
tex-color.sty \
tex-fltpoint.sty \
tex-fp.sty \
tex-ifthen.sty \
tex-multido.sty \
tex-multimedia.sty \
tex-pst-coil.sty \
tex-pstricks.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
