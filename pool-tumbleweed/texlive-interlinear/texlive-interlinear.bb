SUMMARY = "A package for creating interlinear glossed texts with customizable formatting"
DESCRIPTION = "The interlinear package facilitates the creation of interlinear \
glossed texts, commonly used in linguistic examples. It is \
based on the gb4e package and builds upon its functionality to \
provide enhanced features. It offers extensive customization \
options, allowing users to control font styles, formatting, and \
layout. With predefined styles and margin note customization, \
interlinear provides a flexible solution for presenting \
linguistic data."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn72106"

RPM_NAME = "texlive-interlinear-2026.226.1.0svn72106-60.2.noarch.rpm"
RPM_HASH = "ec2cba519564130113cace563f84a34538badbd83f9a538c261d670c773b41ed1f72c2ac6b3b6e3710f40675eec84f3e23b0a7bffd6f2d144979d90734a5c3b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-interlinear.sty \
texlive-interlinear"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-enumitem.sty \
tex-etoolbox.sty \
tex-marginnote.sty \
tex-xifthen.sty \
tex-xkeyval.sty \
tex-xparse.sty \
texlive \
texlive-enumitem \
texlive-etoolbox \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-l3packages \
texlive-marginnote \
texlive-scripts \
texlive-scripts-bin \
texlive-xifthen \
texlive-xkeyval"

inherit rpm
