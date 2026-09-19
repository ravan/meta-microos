SUMMARY = "Typeset exercises in TeX, with answers"
DESCRIPTION = "This is a typeset version of the files of the aro-bend, plus \
three extra questions (with their answers) that Michael Downes \
didn't manage to get onto CTAN."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-around-the-bend-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "fcc595af631fc96f9412fb58b902edf991b8af17dbfbe241b1c9cf12de8b200fedd7f35f7cd91879a79beeb501b91bdf3f88359a74053401e4f92e7a2a282ea9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-around-the-bend"

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
