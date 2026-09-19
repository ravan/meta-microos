SUMMARY = "Guitar chords and song texts"
DESCRIPTION = "(La)TeX macros for typesetting guitar chords over song texts. \
The toolbox package is required. Note that this package only \
places arbitrary TeX code over the lyrics. To typeset the \
chords graphically (and not only by name), the author \
recommends use of an additional package such as gchords by K. \
Peeters."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.6svn32258"

RPM_NAME = "texlive-guitar-2026.226.1.6svn32258-60.4.noarch.rpm"
RPM_HASH = "a682149749902e3941abaf328d6c97a96330156b7fdaf47aad266e5e7b2d683094cb76ffdb82d1e80515237335768026e40190731657ab46479a29b188e59a20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-guitar.sty \
texlive-guitar"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-toolbox.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
