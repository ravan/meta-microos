SUMMARY = "Consolidated environment for displayed text"
DESCRIPTION = "As an alternative to the LaTeX standard environments quotation \
and quote, the package provides a consolidated environment for \
displayed text. First-line indentation may be activated by \
adding a blank line before the quoting environment. A key-value \
interface (using kvoptions) allows the user to configure font \
properties and spacing and to control orphans within and after \
the environment."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1csvn77682"

RPM_NAME = "texlive-quoting-2026.226.0.0.1csvn77682-60.4.noarch.rpm"
RPM_HASH = "3d42d9d65369108701b39f5616dc448ba5cda6fb10eec05cccd3fa3dc6c94e761736e0582c811f74d63c406273d256911e909d5765bc60a011b222af87fbdbc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-quoting.sty \
texlive-quoting"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
