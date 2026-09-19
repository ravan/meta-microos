SUMMARY = "Bibliography formatting with Citation Style Language"
DESCRIPTION = "The Citation Style Language (CSL) is an XML-based language that \
defines the formats of citations and bibliography. There are \
currently thousands of styles in CSL including the most widely \
used APA, Chicago, Vancouver, etc. The citation-style-language \
package is aimed to provide another reference formatting method \
for LaTeX that utilizes the CSL styles. It contains a citation \
processor implemented in pure Lua (citeproc-lua) which reads \
bibliographic metadata and performs sorting and formatting on \
both citations and bibliography according to the selected CSL \
style. A LaTeX package (citation-style-language.sty) is \
provided to communicate with the processor."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.9.1svn77682"

RPM_NAME = "texlive-citation-style-language-2026.226.0.0.9.1svn77682-60.2.noarch.rpm"
RPM_HASH = "6a93e6c9ff7bc71576b480a5e05693cfbc11b23a3d8adc922c5ed355a7b9405780fdf51e39ed118add911d7f5cbd50ac8c8a48e01e4680e3c523ed7e69036277"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-citation-style-language-bib.sty \
tex-citation-style-language-cite.sty \
tex-citation-style-language-compatible.sty \
tex-citation-style-language-data.sty \
tex-citation-style-language-init.sty \
tex-citation-style-language.sty \
texlive-citation-style-language"

RDEPENDS:${PN} += "/usr/bin/luatex \
/usr/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-url.sty \
tex-xparse.sty \
texlive \
texlive-citation-style-language-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3kernel \
texlive-l3packages \
texlive-lua-tinyyaml \
texlive-lua-uca \
texlive-lualibs \
texlive-luatex \
texlive-luaxml \
texlive-scripts \
texlive-scripts-bin \
texlive-url"

inherit rpm
