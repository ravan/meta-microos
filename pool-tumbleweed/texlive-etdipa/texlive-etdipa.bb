SUMMARY = "Simple, lightweight template for scientific documents"
DESCRIPTION = "This package provides a complete working directory for the \
scientific documentation of arbitrary projects. It was \
originally developed to provide a template for Austrian \
'Diplomarbeiten' or 'Vorwissenschaftliche Arbeiten', which are \
scientific projects of students at a secondary school."
LICENSE = "LPPL-1.0"

PV = "2026.226.2.6svn76924"

RPM_NAME = "texlive-etdipa-2026.226.2.6svn76924-59.2.noarch.rpm"
RPM_HASH = "0cf3ee219cda2e5cffc6a77bc6530311ba3eeaf4e94d4cc577d3e15f8595afdadc60fc7ce7000a33bf94143d76cc0c97ecd896448cd66b99872a3029f308c867"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-etdipa"

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
