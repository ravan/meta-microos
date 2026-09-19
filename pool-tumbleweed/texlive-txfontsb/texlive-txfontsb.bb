SUMMARY = "Extensions to txfonts, using GNU Freefont"
DESCRIPTION = "A set of fonts that extend the txfonts bundle with small caps \
and old style numbers, together with Greek support. The \
extensions are made with modifications of the GNU Freefont."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.1.1.1svn54512"

RPM_NAME = "texlive-txfontsb-2026.226.1.1.1svn54512-59.2.noarch.rpm"
RPM_HASH = "8340bc9245b4cfebdc7fe74aa0a237bd3cbd788c2b29b2fc893f62fadbbed1d5adb1af89c54fc46e635f2a452339b8c2e038df04aa9156e31123c70d6febf177"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gptimes.enc \
tex-gptimes.map \
tex-gptimesy.enc \
tex-gtimesb6a.tfm \
tex-gtimesb6a.vf \
tex-gtimesb6r.tfm \
tex-gtimesbi6a.tfm \
tex-gtimesbi6a.vf \
tex-gtimesbi6r.tfm \
tex-gtimesg6r.tfm \
tex-gtimesi6a.tfm \
tex-gtimesi6a.vf \
tex-gtimesi6r.tfm \
tex-gtimesrg6a.tfm \
tex-gtimesrg6a.vf \
tex-gtimessc6a.tfm \
tex-gtimessc6a.vf \
tex-gtimessc6r.tfm \
tex-gtimessco6a.tfm \
tex-gtimessco6a.vf \
tex-gtimessco6r.tfm \
tex-gtimesyb6a.tfm \
tex-gtimesyb6a.vf \
tex-gtimesyb6r.tfm \
tex-gtimesybi6a.tfm \
tex-gtimesybi6a.vf \
tex-gtimesybi6r.tfm \
tex-gtimesyg6r.tfm \
tex-gtimesyi6a.tfm \
tex-gtimesyi6a.vf \
tex-gtimesyi6r.tfm \
tex-gtimesyrg6a.tfm \
tex-gtimesyrg6a.vf \
tex-gtimesysc6a.tfm \
tex-gtimesysc6a.vf \
tex-gtimesysc6r.tfm \
tex-gtimesysco6a.tfm \
tex-gtimesysco6a.vf \
tex-gtimesysco6r.tfm \
tex-lgrtxr.fd \
tex-lgrtxrc.fd \
tex-lgrtxry.fd \
tex-lgrtxryc.fd \
tex-ot1txrc.fd \
tex-ot1txryc.fd \
tex-timessc6a.tfm \
tex-timessc6a.vf \
tex-timessc6r.tfm \
tex-timessco6a.tfm \
tex-timessco6a.vf \
tex-timessco6r.tfm \
tex-txfontsb.sty \
texlive-txfontsb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-txfonts.sty \
tex-updmap.cfg \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-txfontsb-fonts"

inherit rpm
