SUMMARY = "Greek Language Support for XeLaTeX and LuaLaTeX"
DESCRIPTION = "This package has been designed so to allow people to typeset \
Greek language documents using XeLaTeX or LuaLaTeX. It is \
released in the hope that people will use it and spot errors, \
bugs, features so to improve it. Practically, it provides all \
the capabilities of the greek option of the babel package. The \
package can be invoked with any of the following options: \
monotonic (for typesetting modern monotonic Greek), polytonic \
(for typesetting modern polytonic Greek), and ancient (for \
typesetting ancient texts). The default option is monotonic. \
The command \\setlanguage{<lang>} activates the hyphenation \
patterns of the language <lang>. This, however, can only be \
done if the format file has not been built with the babel \
mechanism."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.5.0svn77682"

RPM_NAME = "texlive-xgreek-2026.226.3.5.0svn77682-59.4.noarch.rpm"
RPM_HASH = "ab093e4bdbda94bbe30fdc003fec6dece44b9b82cb3ffab3192757bd721ad7904934f6ed6f2b0ca3ca22b30e6b9ecd691841d28efe6b1b10e92c6fdb5114f0f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xelistings.sty \
tex-xgreek.sty \
texlive-xgreek"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-listings.sty \
tex-luahyphenrules.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
