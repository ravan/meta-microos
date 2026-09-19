SUMMARY = "Boxed Chinese characters with Pinyin above and translation below"
DESCRIPTION = "This is a LaTeX package written to simplify the input of \
Chinese with Hanyu Pinyin and translation. Hanyu Pinyin is \
placed above Chinese with the xpinyin package, and the \
translation is placed below. The package can be used as a \
utility for learning to write and pronounce Chinese characters, \
for Chinese character learning plans, presentations, exercise \
booklets and other documentation work."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.3.0svn77682"

RPM_NAME = "texlive-hanzibox-2026.226.2.3.0svn77682-60.4.noarch.rpm"
RPM_HASH = "722206046fea432941036c0ece4198c0693bd7a507d7f566d8e634d4d910bf2c2d0536b8ed2a6fe8c5dc66f8ff2a3f9f82ea89b1b33972a8242e9ff651f3599c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hanzibox.sty \
texlive-hanzibox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-l3draw.sty \
tex-l3keys2e.sty \
tex-xparse.sty \
tex-xpinyin.sty \
tex-xtemplate.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
