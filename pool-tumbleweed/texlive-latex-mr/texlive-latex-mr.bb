SUMMARY = "A practical guide to LaTeX and Polyglossia for Marathi and other Indian languages"
DESCRIPTION = "The package provides a short guide to LaTeX and specifically to \
the polyglossia package. This document aims to introduce LaTeX \
and polyglossia for Indian languages. Though the document often \
discusses the language Marathi, the discussion applies to other \
India languages also, with some minute changes which are \
described in Section 1.2. We assume that the user of this \
document knows basic (La)TeX or has, at least, tried her hand \
on it. This document is not very suitable for first time users."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn55475"

RPM_NAME = "texlive-latex-mr-2026.226.1.0svn55475-63.2.noarch.rpm"
RPM_HASH = "1b0f402f61815a07b8d6f39118a78dd49922dc9e28db226ae9ff89d09d9f26106086b7bf8f9fceb04cb89bf75794753039b1966f67e4d7dbae14190a5cb3d7bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-mr"

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
