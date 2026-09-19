SUMMARY = "Declare robust command, with \\newcommand checks"
DESCRIPTION = "The package merely provides a variation of \
\\DeclareRobustCommand, which checks for the existence of a \
command before declaring it robust."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.1svn15878"

RPM_NAME = "texlive-robustcommand-2026.226.0.0.1svn15878-60.4.noarch.rpm"
RPM_HASH = "fc1db0ec91e226d4ebe869c94b3fbcd7bf7ae0accb686105d7f4004c9510a9f73466f9b0e7ca2a491702023fe034d9d2e6bea4d67ecae8c151a05df289d5f003"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-robustcommand.sty \
texlive-robustcommand"

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
