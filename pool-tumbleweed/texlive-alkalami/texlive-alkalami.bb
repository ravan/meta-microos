SUMMARY = "A font for Arabic-based writing systems in Nigeria and Niger"
DESCRIPTION = "This font is designed for Arabic-based writing systems in the \
Kano region of Nigeria and Niger."
LICENSE = "OFL-1.1"

PV = "2026.226.1.000svn44497"

RPM_NAME = "texlive-alkalami-2026.226.1.000svn44497-61.2.noarch.rpm"
RPM_HASH = "eb9b9a15fdcea2045b20209388e88bdb1b6763c02107081e8f9359f5871a4b31396595e8077982ef28de6c8a3a4d1a009ad767927fa7bed3acb887396a7c0775"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-alkalami"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-alkalami-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
