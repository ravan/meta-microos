SUMMARY = "Notes in longtables"
DESCRIPTION = "The package provides the functionality of the threeparttable \
package to tables created using the longtable package."
LICENSE = "LPPL-1.0"

PV = "2026.227.0.0.3svn77682"

RPM_NAME = "texlive-threeparttablex-2026.227.0.0.3svn77682-62.2.noarch.rpm"
RPM_HASH = "cc18a533be6a1655eff241bd1ad58899336a624d26f2d721fec3058708183f387763f7cb97fbd4056facc80f07ed088dec020a54d2e1b15c4d8356533dea16a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-threeparttablex.sty \
texlive-threeparttablex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-environ.sty \
tex-threeparttable.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
