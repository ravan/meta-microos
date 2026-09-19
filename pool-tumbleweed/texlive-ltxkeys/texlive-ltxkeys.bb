SUMMARY = "A robust key parser for LaTeX"
DESCRIPTION = "The package provides facilities for creating and managing keys \
in the sense of the keyval and xkeyval packages, but it is \
intended to be more robust and faster. Its robustness comes \
from its ability to preserve braces in key values throughout \
parsing. The need to preserve braces in key values arises often \
in parsing keys (for example, in the xwatermark package). The \
package is faster than xkeyval package because (among other \
things) it avoids character-wise parsing of key values (called \
'selective sanitization' by the xkeyval package). The package \
also provides functions for defining and managing keys."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.0.3csvn28332"

RPM_NAME = "texlive-ltxkeys-2026.226.0.0.0.3csvn28332-59.2.noarch.rpm"
RPM_HASH = "de29840333f9c87967be9f473a31021ab20ecbac67337ba547dc8b60fb8e2bd3dead774e19b83fb3f64219f6ac7839bbe97b1e3929966f0a6c67bfb28437afb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ltxkeys.sty \
texlive-ltxkeys"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-catoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
