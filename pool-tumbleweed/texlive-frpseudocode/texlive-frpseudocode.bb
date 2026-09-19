SUMMARY = "French translation for the algorithmicx package"
DESCRIPTION = "This package is intended for use alongside Szasz Janos' \
algorithmicx package. Its aim is to provide a French \
translation of terms and words used in algorithms to make it \
integrate seamlessly in a French written document."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.3.0svn56088"

RPM_NAME = "texlive-frpseudocode-2026.226.0.0.3.0svn56088-60.2.noarch.rpm"
RPM_HASH = "fdad1e30e98340cd3fd59f12643cef953014d6f264ce7cef60f73aaaeb73062293e357197fe91ae1031efa0c3b84c04b9eb19c8603014f71fd8c69b196c65cb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-frpseudocode.sty \
texlive-frpseudocode"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-algpseudocode.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
