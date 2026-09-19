SUMMARY = "A complete Greek font with Latin and Cyrillic, too"
DESCRIPTION = "This is a redistribution of the original Gentium and \
GentiumBook release from SIL, not altered in any way. Gentium \
is a typeface family designed to enable the diverse ethnic \
groups around the world who use the Latin, Cyrillic and Greek \
scripts to produce readable, high-quality publications. The \
Gentium family includes a complete Greek font, supporting both \
monotonic and polytonic forms. While some Greek characters do \
closely resemble Latin ones, it is a separate design that \
embraces the robust, distinctive character of the Greek script, \
but does so within the design context of the whole typeface. As \
a result, the two scripts can be successfully mixed in a \
paragraph or page of text."
LICENSE = "OFL-1.1"

PV = "2026.226.7.000svn75783"

RPM_NAME = "texlive-gentium-sil-2026.226.7.000svn75783-60.2.noarch.rpm"
RPM_HASH = "be056caab945440ef2b2720ed78e6a2cf7cff703d2360004570d06123a619ea5303597018b3d5bbc87baf22972292027e43fb6182896caeaf876880a35706844"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gentium-sil"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-gentium-sil-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
