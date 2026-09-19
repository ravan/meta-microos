SUMMARY = "LuaTeX packages"
DESCRIPTION = "Packages for LuaTeX, a TeX engine using Lua as an embedded \
scripting and extension language, with native support for \
Unicode, OpenType/TrueType fonts, and both PDF and DVI output. \
The LuaTeX engine itself (and plain formats) are in \
collection-basic."
LICENSE = "LPPL-1.0"

PV = "2026.222.svn77766"

RPM_NAME = "texlive-collection-luatex-2026.222.svn77766-68.2.noarch.rpm"
RPM_HASH = "22a15ecbb464fbe6e6f7b6ab5ac35c600abe4b9b8289b49b289b5ea320f92d9902fc963e08ba3bfe8f1272014cc4129a39fb8868f216f00799f76f219b046d78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
tex-luatex \
texlive-collection-luatex"

RDEPENDS:${PN} += "texlive-addliga \
texlive-addtoluatexpath \
texlive-auto-pst-pdf-lua \
texlive-barracuda \
texlive-bezierplot \
texlive-blopentype \
texlive-char2path \
texlive-checkcites \
texlive-chickenize \
texlive-chinese-jfm \
texlive-cloze \
texlive-collection-basic \
texlive-combofont \
texlive-cstypo \
texlive-ctablestack \
texlive-ekdosis \
texlive-emoji \
texlive-emojicite \
texlive-enigma \
texlive-fancymag \
texlive-farbe \
texlive-gitinfo-lua \
texlive-ideavault \
texlive-innerscript \
texlive-interpreter \
texlive-kanaparser \
texlive-kkluaverb \
texlive-kkran \
texlive-kksymbols \
texlive-ligtype \
texlive-linebreaker \
texlive-longmath \
texlive-lparse \
texlive-lt3luabridge \
texlive-lua-placeholders \
texlive-lua-tinyyaml \
texlive-lua-typo \
texlive-lua-uca \
texlive-lua-ul \
texlive-lua-visual-debug \
texlive-lua-widow-control \
texlive-luaaddplot \
texlive-luacas \
texlive-luacensor \
texlive-luacode \
texlive-luacolor \
texlive-luacomplex \
texlive-luagcd \
texlive-luahttp \
texlive-luahyphenrules \
texlive-luaimageembed \
texlive-luaindex \
texlive-luainputenc \
texlive-luakeys \
texlive-luakeyval \
texlive-lualatex-math \
texlive-lualatex-truncate \
texlive-lualibs \
texlive-lualinalg \
texlive-lualineno \
texlive-luamathalign \
texlive-luamaths \
texlive-luamml \
texlive-luamodulartables \
texlive-luamplib \
texlive-luaoptions \
texlive-luaotfload \
texlive-luapackageloader \
texlive-luaplot \
texlive-luaprogtable \
texlive-luaquotes \
texlive-luarandom \
texlive-luaset \
texlive-luatbls \
texlive-luatex-type-definitions \
texlive-luatex85 \
texlive-luatexbase \
texlive-luatexko \
texlive-luatextra \
texlive-luatikz \
texlive-luatruthtable \
texlive-luavlna \
texlive-luaxml \
texlive-lutabulartools \
texlive-marginalia \
texlive-minim \
texlive-minim-math \
texlive-minim-mp \
texlive-minim-pdf \
texlive-minim-xmp \
texlive-newpax \
texlive-nodetree \
texlive-odsfile \
texlive-optex \
texlive-parstat \
texlive-pdfarticle \
texlive-pdfextra \
texlive-penlight \
texlive-penlightplus \
texlive-piton \
texlive-placeat \
texlive-plantuml \
texlive-pyluatex \
texlive-scikgtex \
texlive-seatingchart \
texlive-selnolig \
texlive-semesterplannerlua \
texlive-showhyphenation \
texlive-showkerning \
texlive-spacekern \
texlive-spelling \
texlive-stricttex \
texlive-sympycalc \
texlive-tango \
texlive-texfindpkg \
texlive-truthtable \
texlive-tsvtemplate \
texlive-typewriter \
texlive-unibidi-lua \
texlive-uninormalize \
texlive-yamlvars"

inherit rpm
