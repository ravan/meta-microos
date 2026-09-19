SUMMARY = "Hungarian dummy text (Lorum ipse)"
DESCRIPTION = "Lorem ipsum is an improper Latin filler dummy text, cf. the \
lipsum package. It is commonly used for demonstrating the \
textual elements of a document template. Lorum ipse is a \
Hungarian variation of Lorem ipsum. (Lorum is a Hungarian card \
game, and ipse is a Hungarian slang word meaning bloke.) With \
this package you can typeset 150 paragraphs of Lorum ipse. All \
paragraphs are taken with permission from \
http://www.lorumipse.hu. Thanks to Lorum Ipse Lab (Viktor Nagy \
and David Takacs) for their work."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn77317"

RPM_NAME = "texlive-hulipsum-2026.226.1.4svn77317-60.2.noarch.rpm"
RPM_HASH = "2e81eda30d9f2e9245356cae3c2435b1d0a47e5cd5a9b3f33edd84867b109b2042943c69dc7acd1f13551a23a35cec3cb654f677c57fb11c2eb9adfd04c288b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hulipsum.sty \
texlive-hulipsum"

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
