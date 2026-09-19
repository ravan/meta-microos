SUMMARY = "Latin modern extended by computer modern"
DESCRIPTION = "The hep-font package loads standard font packages and extends \
the usual Latin Modern implementations by replacing missing \
fonts with Computer Modern counterparts. The package is loaded \
with \\usepackage{hep-font}."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn76220"

RPM_NAME = "texlive-hep-font-2026.226.1.4svn76220-60.4.noarch.rpm"
RPM_HASH = "e15c9a3bdf90832e346c4007aad6a7fe802f69814d9ca8764ecdda917dbfaebe30a5a5f4837a021c087c648f291374644b45404f92513e58296ad9f2befb0d2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hep-font.sty \
texlive-hep-font"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cfr-lm.sty \
tex-etoolbox.sty \
tex-fix-cm.sty \
tex-fontenc.sty \
tex-fontsetup.sty \
tex-fontspec.sty \
tex-iftex.sty \
tex-inputenc.sty \
tex-kvoptions.sty \
tex-microtype.sty \
tex-pdftexcmds.sty \
tex-silence.sty \
tex-slantsc.sty \
tex-textcomp.sty \
tex-units.sty \
tex-xparse.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
