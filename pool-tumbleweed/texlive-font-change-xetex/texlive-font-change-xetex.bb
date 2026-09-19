SUMMARY = "Macros to change text and mathematics fonts in plain XeTeX"
DESCRIPTION = "This package consists of macros that can be used to typeset \
'plain' XeTeX documents using any OpenType or TrueType font \
installed on the computer system. The macros allow the user to \
change the text mode fonts and some math mode fonts. For any \
declared font family, various font style, weight, and size \
variants like bold, italics, small caps, etc., are available \
through standard and custom TeX control statements. Using the \
optional argument of the macros, the available XeTeX font \
features and OpenType tags can be accessed. Other features of \
the package include activating and deactivating hanging \
punctuation, and support for special Unicode characters."
LICENSE = "LPPL-1.0"

PV = "2026.226.2016.1svn40404"

RPM_NAME = "texlive-font-change-xetex-2026.226.2016.1svn40404-60.2.noarch.rpm"
RPM_HASH = "d651b5c04194b7437b91f96533859a02959ed16cda759fdd00c7d76a35dc1bffa510f191ddd413231f665cac17dde43874ce48d7c1cacaf1ff3a729464aa0539"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-font-change-xetex.tex \
texlive-font-change-xetex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
