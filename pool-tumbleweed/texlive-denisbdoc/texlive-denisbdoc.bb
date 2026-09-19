SUMMARY = "A personal dirty package for documenting packages"
DESCRIPTION = "A personal dirty package for documenting classes and packages."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9.6svn77982"

RPM_NAME = "texlive-denisbdoc-2026.226.0.0.9.6svn77982-59.2.noarch.rpm"
RPM_HASH = "96c582f3be7d715bc3f8c3e23c5167b80ce8d1802279450453f465457f5dff40d85d9a231fbb5e901241b8fe7b00f071734d31988df078afef460eaa009543c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-denisbdoc.sty \
texlive-denisbdoc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-accsupp.sty \
tex-afterpage.sty \
tex-amssymb.sty \
tex-attachfile2.sty \
tex-babel.sty \
tex-bookmark.sty \
tex-booktabs.sty \
tex-calc.sty \
tex-comment.sty \
tex-csquotes.sty \
tex-datetime2.sty \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-expl3.sty \
tex-fixfoot.sty \
tex-fontawesome5.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-footmisc.sty \
tex-glossaries-extra.sty \
tex-hologo.sty \
tex-hypcap.sty \
tex-hyperref.sty \
tex-iflang.sty \
tex-ifpdf.sty \
tex-imakeidx.sty \
tex-l3keys2e.sty \
tex-lscape.sty \
tex-ltxcmds.sty \
tex-marginnote.sty \
tex-morewrites.sty \
tex-mparhack.sty \
tex-multirow.sty \
tex-mweights.sty \
tex-nameref.sty \
tex-newunicodechar.sty \
tex-parskip.sty \
tex-path.sty \
tex-pdflscape.sty \
tex-pifont.sty \
tex-refcount.sty \
tex-rotating.sty \
tex-siunitx.sty \
tex-subcaption.sty \
tex-tcolorbox.sty \
tex-textcase.sty \
tex-tikz.sty \
tex-tocbibind.sty \
tex-tocvsec2.sty \
tex-translator.sty \
tex-varioref.sty \
tex-xifthen.sty \
tex-xparse.sty \
tex-xpatch.sty \
tex-zref.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
