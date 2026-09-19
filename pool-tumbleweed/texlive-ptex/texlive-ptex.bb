SUMMARY = "A TeX system for publishing in Japanese"
DESCRIPTION = "pTeX adds features related to vertical writing, and deals with \
other problems in typesetting Japanese. A manual (in both \
Japanese and English) is distributed as package pTeX-manual."
LICENSE = "BSD-3-Clause"

PV = "2026.226.svn77830"

RPM_NAME = "texlive-ptex-2026.226.svn77830-60.4.noarch.rpm"
RPM_HASH = "dabfbdb2b0670a444a559c486b800f93070f9ac05a664148e990585f485d7db3b531697ba363a3ddecc3c4e4408c683723ed9441252f2b560e6d7a2cbccde493"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-eptex.1 \
man-makejvf.1 \
man-mendex.1 \
man-pbibtex.1 \
man-ppltotf.1 \
man-ptekf.1 \
man-ptex.1 \
man-ptftopl.1 \
texlive-ptex \
texlive-ptex-doc-/usr/share/man/man1/makejvf.1.gz"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-language.dat \
tex-language.dat.lua \
tex-language.def \
tex-updmap.cfg \
texlive \
texlive-cm \
texlive-etex \
texlive-filesystem \
texlive-hyphen-base \
texlive-knuth-lib \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-plain \
texlive-ptex-base \
texlive-ptex-bin \
texlive-ptex-fonts \
texlive-scripts \
texlive-scripts-bin \
texlive-uptex"

inherit rpm
