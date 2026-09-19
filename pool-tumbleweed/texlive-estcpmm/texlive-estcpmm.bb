SUMMARY = "Style for Munitions Management Project Reports"
DESCRIPTION = "Provides a class which supports typesetting Cost and \
Performance Reports and Final Reports for Munitions Management \
Reports, US Environmental Security Technology Certification \
Program. The class was commissioned and paid for by US Army \
Corps of Engineers, Engineer Research and Development Center, \
3909 Halls Ferry Road, Vicksburg, MS 39180-6199."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.4svn17335"

RPM_NAME = "texlive-estcpmm-2026.226.0.0.4svn17335-59.2.noarch.rpm"
RPM_HASH = "ed0e870d0f5e6c3516161b50bae7f6c4fffdb6950dcd392843bfcf1854753be326289ca3f3b0d0da02e4ae9a3fa6757026d88d5bd214ef64b2c31418b0deabc1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-estcpmm.cls \
texlive-estcpmm"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-book.cls \
tex-caption.sty \
tex-courier.sty \
tex-fancyhdr.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-helvet.sty \
tex-mathptmx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
