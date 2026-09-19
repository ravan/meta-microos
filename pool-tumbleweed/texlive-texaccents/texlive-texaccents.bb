SUMMARY = "Convert composite accented characters to Unicode"
DESCRIPTION = "This small utility, written in SNOBOL, converts the composition \
of special characters to Unicode, e. g. \\'{a} - a, \\k{a} - a, \
..."
LICENSE = "LPPL-1.0"

PV = "2026.227.1.0.1svn64447"

RPM_NAME = "texlive-texaccents-2026.227.1.0.1svn64447-62.2.noarch.rpm"
RPM_HASH = "ebac6556d29e12d9f6b4321ab112206fafa9de326855065daf97665e710650e08fd3587a5ef36e0ac8f2fd53f919e2223061acbb46fb8dc371f4adbeeed27a7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texaccents"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/bin/snobol4 \
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
texlive-scripts-bin \
texlive-texaccents-bin"

inherit rpm
