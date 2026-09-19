SUMMARY = "Producing 'blind' text for testing"
DESCRIPTION = "The package provides the commands \\blindtext and \\Blindtext for \
creating 'blind' text useful in testing new classes and \
packages, and \\blinddocument, \\Blinddocument for creating an \
entire random document with sections, lists, mathematics, etc. \
The package supports three languages, english, (n)german and \
latin; the latin option provides a short 'lorem ipsum' (for a \
fuller lorem ipsum text, see the lipsum package)."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.0svn77682"

RPM_NAME = "texlive-blindtext-2026.226.2.0svn77682-59.2.noarch.rpm"
RPM_HASH = "4582422c52407146a28a54581e7ca9f8bdec5bacc06789dec1c23794d082cb31337472fc011b7dfff6ec2bdde7a33846fd7f2ef9c0e2a039183ba98946527070"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-blindtext.sty \
texlive-blindtext"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-xspace.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
