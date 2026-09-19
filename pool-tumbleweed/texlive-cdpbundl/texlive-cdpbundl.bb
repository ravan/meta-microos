SUMMARY = "Business letters in the Italian style"
DESCRIPTION = "The C.D.P. Bundle can be used to typeset high-quality business \
letters formatted according to Italian style conventions. It is \
highly configurable, and its modular structure provides you \
with building blocks of increasing level, by means of which you \
can compose a large variety of letters. It is also possible to \
write letters divided into sections and paragraphs, to include \
floating figures and tables, and to have the relevant indexes \
compiled automatically. A single input file can contain several \
letters, and each letter will have its own table of contents, \
etc., independent from the other ones."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.36dsvn61719"

RPM_NAME = "texlive-cdpbundl-2026.226.0.0.36dsvn61719-59.2.noarch.rpm"
RPM_HASH = "e3113bda7b2d28d998b1d8672c16a1536537bd1e4ac289e64fc346fa4ccb7cbf266926aa660846f4b03a599477a751287202e230b4c8310a4c8f0726de17044b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-articoletteracdp.cls \
tex-cdpaddon.sty \
tex-cdpbabel.sty \
tex-cdpnamesenglish.ldf \
tex-cdpnamesitalian.ldf \
tex-cdpshues-example.def \
tex-cdpshues.cfg \
tex-epson-stylus-740.def \
tex-hp-laserjet-4500.def \
tex-letteracdp.cls \
texlive-cdpbundl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-color.sty \
tex-eepic.sty \
tex-hyperref.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
