SUMMARY = "Generate Type 1 fonts from MetaPost"
DESCRIPTION = "The system employs scripts, common utility programs, and a set \
of MetaPost macros to provide a means of expressing the details \
outline fonts directly in the MetaPost language. The system was \
employed to generate the Latin Modern fonts, and the \
distribution includes an example development of Knuth's logo \
fonts."
LICENSE = "SUSE-Public-Domain"

PV = "2026.226.0.0.56svn37105"

RPM_NAME = "texlive-metatype1-2026.226.0.0.56svn37105-61.2.noarch.rpm"
RPM_HASH = "232526177d946da31a817b1220786f3a1e609010725c845cdd6dc1f777f9d3dd84aa050fb2c3d1e440dd2570ac3f018f5c439960dc3dc4c86d6d28f4c849150b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metatype1"

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
