SUMMARY = "A DVI to PostScript driver"
DESCRIPTION = "This package has been withdrawn from CTAN, and bundled into the \
distributions' package sets. Development now takes place within \
the TeX Live framework, and it is no longer available as a \
separate package. For download, support, and other information, \
please see TeX Live."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn77830"

RPM_NAME = "texlive-dvips-2026.226.svn77830-61.4.noarch.rpm"
RPM_HASH = "da6be449e84edd940d3207cf9951cc7c9d73f9801b526093b9d2d9f75dc0b760821d42ddff207300e6c40e4af450ec2303594666ed5fb8c48e09e56db6d335f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-dvips \
tex-6w.enc \
tex-7t.enc \
tex-8a.enc \
tex-8r.enc \
tex-ad.enc \
tex-ansinew.enc \
tex-asex.enc \
tex-asexp.enc \
tex-blackdvi.sty \
tex-blackdvi.tex \
tex-canonex.cfg \
tex-colordvi.sty \
tex-colordvi.tex \
tex-cx.cfg \
tex-dc.enc \
tex-deskjet.cfg \
tex-dfaxhigh.cfg \
tex-dvips-all.enc \
tex-dvips.enc \
tex-dvired.cfg \
tex-ec.enc \
tex-epson.cfg \
tex-extex.enc \
tex-funky.enc \
tex-ibmvga.cfg \
tex-ljfour.cfg \
tex-odvips.enc \
tex-q-cs-uni.enc \
tex-q-ec-uni.enc \
tex-q-l7x-uni.enc \
tex-q-qx-uni.enc \
tex-q-rm-uni.enc \
tex-q-t2a-uni.enc \
tex-q-t2b-uni.enc \
tex-q-t2c-uni.enc \
tex-q-t5-uni.enc \
tex-q-texnansi-uni.enc \
tex-q-ts1-uni.enc \
tex-qms.cfg \
tex-qx.enc \
tex-rotate.sty \
tex-rotate.tex \
tex-stormex.enc \
tex-tex256.enc \
tex-texmext.enc \
tex-texmital.enc \
tex-texmsym.enc \
tex-texnansx.enc \
tex-toshiba.cfg \
texlive-dvips"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-dvips-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
