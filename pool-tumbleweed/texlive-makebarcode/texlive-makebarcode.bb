SUMMARY = "Print various kinds 2/5 and Code 39 bar codes"
DESCRIPTION = "The package contains macros for printing various 2/5 bar codes \
and Code 39 bar codes. The macros do not use fonts but create \
the bar codes directly using vertical rules. It is therefore \
possible to vary width to height ratio, ratio of thin and thick \
bars. The package is therefore convenient for printing ITF bar \
codes as well as bar codes for identification labels for HP \
storage media."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn15878"

RPM_NAME = "texlive-makebarcode-2026.226.1.0svn15878-59.2.noarch.rpm"
RPM_HASH = "ea051e58ba046ca746323f429d10cef4fc04336d50b465a07db4a866b108591ee3a5e1cecc9a8c8a8dfb6b92cb676950b90300be52f955415edc792c17c17e32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-makebarcode.sty \
texlive-makebarcode"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
