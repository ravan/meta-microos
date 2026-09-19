SUMMARY = "Use color emojis more conveniently"
DESCRIPTION = "This package lets users output color emojis in LaTeX documents. \
Compared to other packages with similar functionality, this \
package has the following merits: It supports all major LaTeX \
engines. Emojis can be entered as the characters themselves, as \
their Unicode code values, or as their short names. It works \
reasonably well in PDF strings when using hyperref. Emojis can \
be handled properly even in Japanese typesetting environments. \
This package has been widely used among the Japanese LaTeX \
community, but there are already many emoji packages on CTAN \
and in TeX Live. To avoid uploading a large amount of emoji \
image data that are essentially identical, the package was \
revised in version 1.0 so that the image output was delegated \
to the twmojis package. Therefore, this package now contains no \
image data."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0asvn77682"

RPM_NAME = "texlive-bxcoloremoji-2026.226.1.0asvn77682-59.2.noarch.rpm"
RPM_HASH = "2926b6983decfe3a142fc44c08ffadfab292fe7b0d5697b034cd83837330a304dda1a3750e613105ec9c78684ddb25f50dd9b535a7df3f6e931f11fd5bac9917"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bxcoloremoji-names.def \
tex-bxcoloremoji.sty \
texlive-bxcoloremoji"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-bxghost-lib.sty \
tex-bxghost.sty \
tex-color.sty \
tex-etoolbox.sty \
tex-graphicx.sty \
tex-keyval.sty \
tex-twemojis.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-twemojis"

inherit rpm
