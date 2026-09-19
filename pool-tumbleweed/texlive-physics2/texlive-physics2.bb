SUMMARY = "Macros for typesetting maths faster and more simply"
DESCRIPTION = "The physics2 package defines commands for typesetting maths \
formulae faster and more simply. physics2 is a modularized \
package, each module provides its own function. You can load \
modules separately after loading physics2. Modules of physics \
provide the following support: Automatic braces; Dirac bra-ket \
notation; Easy way to typeset diagonal matrices and matrices \
with similar entries; Double cross and double dot (binary) \
operators for tensors."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0.1svn69369"

RPM_NAME = "texlive-physics2-2026.226.1.0.1svn69369-58.2.noarch.rpm"
RPM_HASH = "71397806535da56b3ab9de93da5a458d6f4a5fceecbf20981de3912c9e8580ad4a1de77c4e07854414f911c960c118118a6840199a509c178cff4bed6ef62b3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-phy-ab.braket.sty \
tex-phy-ab.legacy.sty \
tex-phy-ab.sty \
tex-phy-bm-um.legacy.sty \
tex-phy-braket.sty \
tex-phy-diagmat.sty \
tex-phy-doubleprod.sty \
tex-phy-nabla.legacy.sty \
tex-phy-op.legacy.sty \
tex-phy-qtext.legacy.sty \
tex-phy-xmat.sty \
tex-physics2.sty \
texlive-physics2"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amstext.sty \
tex-fixdif.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
