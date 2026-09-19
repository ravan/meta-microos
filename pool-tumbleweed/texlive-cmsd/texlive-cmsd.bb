SUMMARY = "Interfaces to the CM Sans Serif Bold fonts"
DESCRIPTION = "Thr purpose of the package is to provide an alternative \
interface to the CM Sans Serif boldface fonts. The EC (T1, \
Cork) encoded versions of the 'CM Sans Serif boldface extended' \
fonts differ considerably from the traditionally (OT1) encoded \
ones: at large sizes, >10pt, they have thinner strokes and are \
much wider. At 25pt they are hardly to be recognized as being \
'boldface'. This package attempts to make these T1 fonts look \
like the traditional ones did. You do not need any new fonts; \
the package just changes the way LaTeX makes use of the current \
ones."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn18787"

RPM_NAME = "texlive-cmsd-2026.226.svn18787-60.2.noarch.rpm"
RPM_HASH = "298e819b9ffe9291ef96c2edbe525c0f3557dbbaa038d3bfa85d514b53a23a72eba92937eca408aad0969da2b0080d887960b98e3b378de9df5ea0e723806194"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cmsd.sty \
tex-t1cmsd.fd \
tex-ts1cmsd.fd \
texlive-cmsd"

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
