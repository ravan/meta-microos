SUMMARY = "Get the current git hash of a project and typeset it in the document"
DESCRIPTION = "This package will get a description of the current git version \
of the document and store it in a command \\gitVer. If memoir or \
fancyhdr are in use, it will also add this to the document \
footers unless the option 'noheader' is passed. The package \
also defines a command \\versionBox which outputs a box \
containing the version and date of compilation. The package \
requires hyperref, catchfile, pdftexcmds, and datetime."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.4svn76924"

RPM_NAME = "texlive-gitver-2026.226.1.4svn76924-60.4.noarch.rpm"
RPM_HASH = "ba3eb3ceffea17c107da729cfd1bb2cf087c75d3b52e0e851e7f6db3133d800f68524a1328b8060382023a395a482c1485db5c8e0170cac60ca8849945a76cd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gitver.sty \
texlive-gitver"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-catchfile.sty \
tex-datetime2.sty \
tex-hyperref.sty \
tex-ifluatex.sty \
tex-ifthen.sty \
tex-pdftexcmds.sty \
tex-shellesc.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
