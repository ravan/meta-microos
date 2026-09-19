SUMMARY = "Modern Russian typesetting"
DESCRIPTION = "Eskdx is a collection of LaTeX classes and packages to typeset \
textual and graphical documents in accordance with Russian (and \
probably post USSR) standards for designers."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.98svn29235"

RPM_NAME = "texlive-eskdx-2026.226.0.0.98svn29235-59.2.noarch.rpm"
RPM_HASH = "91709c80873b7deff908aeeb175fdef3939f4e4b407ca77417b23d5e9c2e24fbcc963dea2b4027502f88b4a648d6faa54c5a1901c43dc1563d57e1ad2c21b90a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eskdafterpkg.sty \
tex-eskdappsheet.sty \
tex-eskdbiblist.sty \
tex-eskdcap.sty \
tex-eskdchngsheet.sty \
tex-eskddstu.sty \
tex-eskdexplan.sty \
tex-eskdfont.sty \
tex-eskdfootnote.sty \
tex-eskdfreesize.sty \
tex-eskdgraph.cls \
tex-eskdhash.sty \
tex-eskdindent.sty \
tex-eskdinfo.sty \
tex-eskdlang.sty \
tex-eskdlist.sty \
tex-eskdpara.sty \
tex-eskdplain.sty \
tex-eskdrussian.def \
tex-eskdsect.sty \
tex-eskdspec.sty \
tex-eskdspecii.sty \
tex-eskdstamp.sty \
tex-eskdtab.cls \
tex-eskdtext.cls \
tex-eskdtitle.sty \
tex-eskdtitlebase.sty \
tex-eskdtotal.sty \
tex-eskdukrainian.def \
texlive-eskdx"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-array.sty \
tex-article.cls \
tex-babel.sty \
tex-calc.sty \
tex-caption.sty \
tex-chngpage.sty \
tex-everyshi.sty \
tex-extarticle.cls \
tex-ifpdf.sty \
tex-indentfirst.sty \
tex-inputenc.sty \
tex-keyval.sty \
tex-lastpage.sty \
tex-longtable.sty \
tex-lscape.sty \
tex-rotating.sty \
tex-zref-perpage.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
