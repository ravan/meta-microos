SUMMARY = "LaTeX support for scaled Iwona math fonts"
DESCRIPTION = "This package provides an interface to the Iwona math fonts by \
Janusz Marian Nowacki. It allows to use Iwona as math \
complement for sans serif fonts without native math. The \
package allows font scaling, the choice of light and condensed \
versions, and the creation of multiple math versions."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1svn77682"

RPM_NAME = "texlive-iwonamath-2026.226.1.1svn77682-63.2.noarch.rpm"
RPM_HASH = "043aeb352700384014e9eea5f6d8e5730edec9dee76cc54050a6561f13c4ce0c3a887ddbbea1eca2662c274bb622734280c10706857ce84197024bb5168d9ec5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-iwonamath.sty \
tex-omliwonamath.fd \
tex-omliwonamathc.fd \
tex-omliwonamathl.fd \
tex-omliwonamathlc.fd \
tex-omsiwonamath.fd \
tex-omsiwonamathc.fd \
tex-omsiwonamathcmsy.fd \
tex-omsiwonamathl.fd \
tex-omsiwonamathlc.fd \
tex-omxiwonamath.fd \
tex-omxiwonamathc.fd \
tex-omxiwonamathl.fd \
tex-omxiwonamathlc.fd \
tex-ot1iwonamath.fd \
tex-ot1iwonamathc.fd \
tex-ot1iwonamathcm.fd \
tex-ot1iwonamathl.fd \
tex-ot1iwonamathlc.fd \
tex-ot1iwonamathlcm.fd \
tex-ot1iwonamathlm.fd \
tex-ot1iwonamathm.fd \
texlive-iwonamath"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-l3keys2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
