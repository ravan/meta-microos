SUMMARY = "TeX Live manual (Serbian)"
DESCRIPTION = "The texlive-sr package"
LICENSE = "LPPL-1.0"

PV = "2026.227.svn54594"

RPM_NAME = "texlive-texlive-sr-2026.227.svn54594-62.2.noarch.rpm"
RPM_HASH = "f617b7681bae79ec22fd0399739174347c8f108005f8876b682b0812233543da889e0a4fdcc850401f319673c790f2e938c01e9f0bf8a68f217caa8e06e57a8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texlive-sr"

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
