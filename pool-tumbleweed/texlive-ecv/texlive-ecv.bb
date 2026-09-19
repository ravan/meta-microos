SUMMARY = "A fancy Curriculum Vitae class"
DESCRIPTION = "The class provides an environment for creating a fancily laid \
out tabular curriculum vitae inspired by the european \
curriculum vitae. The distribution comes with a German and an \
English template."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3svn24928"

RPM_NAME = "texlive-ecv-2026.226.0.0.3svn24928-61.4.noarch.rpm"
RPM_HASH = "adada31b59e1eecf712c92dff14e2163e0cf3eb3c873822c005fbf23248db6f58bea170cba0bd1439ae7094d18e76f3be317be4c93463146b9b5e6c65049002d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ecv.cls \
tex-ecvEnglish.ldf \
tex-ecvGerman.ldf \
tex-ecvNLS.sty \
texlive-ecv"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-babel.sty \
tex-fancyhdr.sty \
tex-fontenc.sty \
tex-geometry.sty \
tex-helvet.sty \
tex-hyperref.sty \
tex-ifpdf.sty \
tex-ifthen.sty \
tex-inputenc.sty \
tex-longtable.sty \
tex-paralist.sty \
tex-pgf.sty \
tex-selinput.sty \
tex-url.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
