SUMMARY = "Typeset Backus Naur Form definitions"
DESCRIPTION = "The package typesets Backus-Naur Form (BNF) definitions. It \
prints formatted lists of productions, with numbers if \
required. It can also print in-line BNF expressions using math \
mode."
LICENSE = "LPPL-1.0"

PV = "2026.226.3.1svn54080"

RPM_NAME = "texlive-backnaur-2026.226.3.1svn54080-60.2.noarch.rpm"
RPM_HASH = "b1c441fb9c509220ec25632d668fc502b792b3657238f94743b76618357e607c84d6c308c5a54024439cfe3a023df812c2c8ab921d31b0d7c90f29403ee46f58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-backnaur.sty \
texlive-backnaur"

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
