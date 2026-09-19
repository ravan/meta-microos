SUMMARY = "Math and small cap additions to Gelasio fonts"
DESCRIPTION = "The package offers math support for the gelasio package, using \
symbols from newtxmath, Roman math letters from Gelasio and \
Greek math letters based on XCharter Greek. Also added small \
caps based on XCharter small caps and other minor features to \
Gelasio."
LICENSE = "OFL-1.1"

PV = "2026.226.1.01svn77682"

RPM_NAME = "texlive-gelasiomath-2026.226.1.01svn77682-60.2.noarch.rpm"
RPM_HASH = "0982d6e99eb4e8204f0fcb4b7ab61a2bc2a17f6813e1d376f18e45b36935f0ba352b550c2812f8a8526984fcbfe8625b2f425c81fd4b521ee6c195a414714a66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-Gelasio-Bold-tlf-ot1G.tfm \
tex-Gelasio-Bold-tlf-ot1G.vf \
tex-Gelasio-BoldItalic-tlf-ot1G.tfm \
tex-Gelasio-BoldItalic-tlf-ot1G.vf \
tex-Gelasio-Italic-tlf-ot1G.tfm \
tex-Gelasio-Italic-tlf-ot1G.vf \
tex-Gelasio-Regular-tlf-ot1G.tfm \
tex-Gelasio-Regular-tlf-ot1G.vf \
tex-GelasioMath.map \
tex-GelasioMathBMI.tfm \
tex-GelasioMathBRM.tfm \
tex-GelasioMathMI.tfm \
tex-GelasioMathRM.tfm \
tex-gelasiomath.sty \
tex-ly1mingelasio.fd \
tex-omlzgelmi.fd \
tex-ot1mingelasio.fd \
tex-t1mingelasio.fd \
tex-zgelbmi.tfm \
tex-zgelbmi.vf \
tex-zgelbmia.tfm \
tex-zgelbmia.vf \
tex-zgelmi.tfm \
tex-zgelmi.vf \
tex-zgelmia.tfm \
tex-zgelmia.vf \
texlive-gelasiomath"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-Gelasio-Bold-tlf-ot1.tfm \
tex-Gelasio-BoldItalic-tlf-ot1.tfm \
tex-Gelasio-Italic-tlf-ot1.tfm \
tex-Gelasio-Regular-tlf-ot1.tfm \
tex-XCharter-Bold-tlf-ot1G.tfm \
tex-XCharter-BoldItalic-tlf-ot1.tfm \
tex-XCharter-Italic-tlf-ot1G.tfm \
tex-XCharter-Roman-tlf-ot1G.tfm \
tex-etoolbox.sty \
tex-iftex.sty \
tex-ifthen.sty \
tex-newtx.sty \
tex-stxscr.tfm \
tex-txbmiaSTbb.tfm \
tex-txbmiaX.tfm \
tex-txmiaSTbb.tfm \
tex-txmiaX.tfm \
tex-updmap.cfg \
tex-xkeyval.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-gelasiomath-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
