SUMMARY = "Set parameters for other packages, conveniently"
DESCRIPTION = "The package provides a small number of convenient macros that \
access features in other frequently-used packages, or provide \
interfaces to other useful facilities such as the pdfTeX \
\\pdfelapsedtime primitive. Most of these macros use pgfkeys to \
provide a key-value syntax. The package also uses the package \
scrlfile from the Koma-Script bundle (for controlled loading of \
other files) and etoolbox. The package is bundled with \
sub-packages containing actual interfaces: by default, the \
package loads all available sub-packages, but techniques are \
provided for the user to select no more than the interfaces \
needed for a job."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.1svn21474"

RPM_NAME = "texlive-interfaces-2026.226.3.1svn21474-60.2.noarch.rpm"
RPM_HASH = "4b8920a9f3b7159edfa70d1f2ed5221aa7b3e7bc099872a85fb50709972b26bb5b900a88b551901b4178ae25e534715a4e6fbd603b7232cbdcedb5f6780bda1d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-interfaces-LaTeX.sty \
tex-interfaces-appendix.sty \
tex-interfaces-base.sty \
tex-interfaces-bookmark.sty \
tex-interfaces-embedfile.sty \
tex-interfaces-enumitem.sty \
tex-interfaces-environ.sty \
tex-interfaces-etoolbox.sty \
tex-interfaces-fancyhdr.sty \
tex-interfaces-hypbmsec.sty \
tex-interfaces-hyperref.sty \
tex-interfaces-makecell.sty \
tex-interfaces-marks.sty \
tex-interfaces-pgfkeys.sty \
tex-interfaces-scrlfile.sty \
tex-interfaces-tikz.sty \
tex-interfaces-titlesec.sty \
tex-interfaces-tocloft.sty \
tex-interfaces-truncate.sty \
tex-interfaces-umrand.sty \
tex-interfaces.sty \
texlive-interfaces"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-auxhook.sty \
tex-etex.sty \
tex-etoolbox.sty \
tex-fp.sty \
tex-gettitlestring.sty \
tex-infwarerr.sty \
tex-ltxcmds.sty \
tex-pgfkeys.sty \
tex-refcount.sty \
tex-scrlfile.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
