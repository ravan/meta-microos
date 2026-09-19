SUMMARY = "Load properties from a file"
DESCRIPTION = "The package loads properties (key, value) from a properties \
file, e.g. \\jobname.properties."
LICENSE = "LPPL-1.0"

PV = "2026.226.0.0.2svn15878"

RPM_NAME = "texlive-properties-2026.226.0.0.2svn15878-59.2.noarch.rpm"
RPM_HASH = "2a07cbe4acce6d9a97a76ab192136983618575948c1984b56985bba599686321b8b77524a7b9aca6676b2f6bebdf1034bc0ecd2d1b1fd21e7a617f9569973ee9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-properties.sty \
texlive-properties"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-datatool.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
