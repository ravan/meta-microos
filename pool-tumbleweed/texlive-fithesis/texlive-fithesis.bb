SUMMARY = "Thesis class and template for Masaryk University (Brno, Czech Republic)"
DESCRIPTION = "A document class for the typesetting of theses at the Masaryk \
University (Brno, Czech Republic). The class has been designed \
for easy extensibility by style and locale files of other \
academic institutions."
LICENSE = "LPPL-1.0"

PV = "2026.226.1.1.2svn76028"

RPM_NAME = "texlive-fithesis-2026.226.1.1.2svn76028-59.2.noarch.rpm"
RPM_HASH = "cc05561d93efef5051dbbbf727febdd600112b681cd9c83d42ac0169cdd1297fca600060444339ae0a037ee65014e34e5b960b7f9b073c44d8b8f013f6363211"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fithesis-base.sty \
tex-fithesis-czech.def \
tex-fithesis-english.def \
tex-fithesis-mu-10.clo \
tex-fithesis-mu-11.clo \
tex-fithesis-mu-12.clo \
tex-fithesis-mu-base.sty \
tex-fithesis-mu-econ.sty \
tex-fithesis-mu-fi.sty \
tex-fithesis-mu-fsps.sty \
tex-fithesis-mu-fss.sty \
tex-fithesis-mu-law.sty \
tex-fithesis-mu-med.sty \
tex-fithesis-mu-ped.sty \
tex-fithesis-mu-pharm.sty \
tex-fithesis-mu-phil.sty \
tex-fithesis-mu-sci.sty \
tex-fithesis-slovak.def \
tex-fithesis.cls \
tex-fithesis2.cls \
tex-fithesis3.cls \
tex-fithesis4.cls \
texlive-fithesis"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-caption.sty \
tex-cmap.sty \
tex-etoolbox.sty \
tex-fontenc.sty \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-inputenc.sty \
tex-keyval.sty \
tex-ltxcmds.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
