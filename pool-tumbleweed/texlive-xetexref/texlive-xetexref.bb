SUMMARY = "Reference documentation of XeTeX"
DESCRIPTION = "The package comprises reference documentation for XeTeX \
detailing its extended features."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn73885"

RPM_NAME = "texlive-xetexref-2026.226.svn73885-59.4.noarch.rpm"
RPM_HASH = "2a80d51f1ccb44539a693ad995d054534837be0f94279457b6a3b359d4a8684e97287cec5728475a77107ad27591889509df949e90cc17004952a551a4cdb08f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xetexref"

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
