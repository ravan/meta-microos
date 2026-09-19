SUMMARY = "Plain TeX macros for resumes"
DESCRIPTION = "A set of macros is provided, together with an file that offers \
an example of use."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-resumemac-2026.226.svn15878-60.4.noarch.rpm"
RPM_HASH = "a0f5f9c97cdda5c859e3d88618f594ac2f72ed982f8e97437167296cda789c808fa9af5be288f282d0debde3029bba010eb562d88ddc96be66879f3432d2eae9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-resumemac.tex \
texlive-resumemac"

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
