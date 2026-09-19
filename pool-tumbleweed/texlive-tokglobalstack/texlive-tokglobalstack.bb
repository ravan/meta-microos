SUMMARY = "Dedicated global stacks implementations"
DESCRIPTION = "Global stack(s) of tokens implemented as variables or commands."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.0svn77947"

RPM_NAME = "texlive-tokglobalstack-2026.226.1.0svn77947-59.2.noarch.rpm"
RPM_HASH = "098228403a6b3e5eea8ca8239aa308fd49908b74c48a8652bde9cb7e138222e77972f7bedd306cc4779fdf0650dd23a0b4efa1fcc33e742bbcdf92ec45ea759b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tokglobalstack.sty \
texlive-tokglobalstack"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pkginfograb.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
