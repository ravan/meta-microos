SUMMARY = "Typeset Hangul, coded in UTF-8"
DESCRIPTION = "The package typesets Hangul, which is the native alphabet of \
the Korean language; input Korean text should be encoded in \
UTF-8. The bundle (of class and associated packages) belongs to \
the ko.TeX bundle."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.0.0svn63690"

RPM_NAME = "texlive-kotex-utf-2026.226.3.0.0svn63690-63.2.noarch.rpm"
RPM_HASH = "d51565a458ee0959668eeae710ce1b5347a5c4e7bde44f43940799bbcd70634d9d0cf1c39353b9986e8a8ecb9d258e3e0955a99882f5a417ce31e0a8ca7adf03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dhucs-cmap.sty \
tex-dhucs-enumerate.sty \
tex-dhucs-enumitem.sty \
tex-dhucs-gremph.sty \
tex-dhucs-interword.sty \
tex-dhucs-nanumfont.sty \
tex-dhucs-paralist.sty \
tex-dhucs-sectsty.sty \
tex-dhucs-setspace.sty \
tex-dhucs-trivcj.sty \
tex-dhucs-ucshyper.sty \
tex-dhucs.cfg \
tex-dhucs.sty \
tex-dhucsfn.sty \
tex-kosections-utf.sty \
tex-kotex-logo.sty \
tex-kotex-sections.sty \
tex-kotex-varioref.sty \
tex-kotex.cfg \
tex-kotexutf.sty \
tex-lucuhcmj.fd \
texlive-kotex-utf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-enumerate.sty \
tex-enumitem.sty \
tex-fnpara.sty \
tex-fontenc.sty \
tex-hologo.sty \
tex-hyperref.sty \
tex-ifpdf.sty \
tex-iftex.sty \
tex-inputenc.sty \
tex-kolabels-utf.sty \
tex-konames-utf.sty \
tex-l3keys2e.sty \
tex-luatexko.sty \
tex-paralist.sty \
tex-sectsty.sty \
tex-setspace.sty \
tex-varioref.sty \
tex-verbatim.sty \
tex-xetexko.sty \
tex-xkeyval.sty \
texlive \
texlive-cjk-ko \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
