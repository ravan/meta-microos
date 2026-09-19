SUMMARY = "A 'relaxed' font encoding"
DESCRIPTION = "LaTeX package providing a relaxed font encoding to make \
available to a font designer more slots for insertion of \
ligatures and accented characters."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn22050"

RPM_NAME = "texlive-relenc-2026.226.svn22050-60.4.noarch.rpm"
RPM_HASH = "1686ff99601ec1c4ff06b573237b580966b275c741c69430e6c161103ea31d6cef5e84af79f703fc62ea78550edd2ecc82bbde30ca6fa6cad58a3604b4caa157"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-2sidedoc.sty \
tex-ecsubzcm.sty \
tex-relenc.sty \
tex-t1renc.def \
tex-t1rzcm.fd \
tex-zcmr8d.tfm \
tex-zcmr8d.vf \
tex-zcmra.tfm \
tex-zcmra.vf \
texlive-relenc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cmmi10.tfm \
tex-cmr10.tfm \
tex-cmr5.tfm \
tex-cmr6.tfm \
tex-cmsy10.tfm \
tex-cmtt10.tfm \
tex-cmu10.tfm \
tex-lasy10.tfm \
tex-lcircle10.tfm \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
