SUMMARY = "Subversion variants of \\Provides... macros"
DESCRIPTION = "The package introduces Subversion variants of the standard \
LaTeX macros \\ProvidesPackage, \\ProvidesClass and \\ProvidesFile \
where the file name and date is extracted from Subversion Id \
keywords. The file name may also be given explicitly as an \
optional argument."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.1862svn77682"

RPM_NAME = "texlive-svn-prov-2026.226.3.1862svn77682-64.2.noarch.rpm"
RPM_HASH = "5c8dc846634b153db15bc6b2a658d3d2c9d14003ec05b0e77a1b7ad57726acb4ba5bb03dc4d07d45d721754812a2bb8ca9aeede636a405fc6b6b10ced91c75e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-svn-prov.sty \
texlive-svn-prov"

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
