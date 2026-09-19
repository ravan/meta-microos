SUMMARY = "CM-Super family of fonts"
DESCRIPTION = "The CM-Super family provides Adobe Type 1 fonts that replace \
the T1/TS1-encoded Computer Modern (EC/TC), T1/TS1-encoded \
Concrete, T1/TS1-encoded CM bright and LH Cyrillic fonts (thus \
supporting all European languages except Greek), and bringing \
many ameliorations in typesetting quality. The fonts exhibit \
the same metrics as the Metafont-encoded originals."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn15878"

RPM_NAME = "texlive-cm-super-2026.226.svn15878-60.2.noarch.rpm"
RPM_HASH = "6b8e793a906a8950473dfca1c0ba1c0075d879bb28f4b5742720eb13fb177e5912eaf588d2a8c344f372479c624b585c85e659d68e20ded1a7ceb1c6862e9a13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cm-super-t1.enc \
tex-cm-super-t1.map \
tex-cm-super-t2a.enc \
tex-cm-super-t2a.map \
tex-cm-super-t2b.enc \
tex-cm-super-t2b.map \
tex-cm-super-t2c.enc \
tex-cm-super-t2c.map \
tex-cm-super-ts1.enc \
tex-cm-super-ts1.map \
tex-cm-super-x2.enc \
tex-cm-super-x2.map \
tex-type1ec.sty \
texlive-cm-super"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-t1cmr.fd \
tex-updmap.cfg \
texlive \
texlive-cm-super-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
