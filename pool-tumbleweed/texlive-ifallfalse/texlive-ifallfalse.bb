SUMMARY = "Compare a string against a set of other strings"
DESCRIPTION = "This package allows you to check whether a string is contained \
within another set of strings, and perform an action if it is \
not. This is done by using the allfalse environment and passing \
in a string and an action to be performed if the string is not \
contained in the set. Then, passing in a string to the \\orcheck \
macro inside the respective allfalse environment adds that to \
the set of strings. This package does not work with the LuaTeX \
engine."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0.0svn60027"

RPM_NAME = "texlive-ifallfalse-2026.226.2.0.0svn60027-60.2.noarch.rpm"
RPM_HASH = "ae7f184717c4dcb79c10d5d916bd80d81476bcca783b939e79de2ad4d4b2256a62d713e843d44a8a15d8f7c90199e6bde9093cb6106db6b5551330bda71f1f82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ifallfalse.sty \
texlive-ifallfalse"

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
