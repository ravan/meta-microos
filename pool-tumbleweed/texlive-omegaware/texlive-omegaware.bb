SUMMARY = "A wide-character-set extension of TeX"
DESCRIPTION = "A development of TeX, which deals in multi-octet Unicode \
characters, to enable native treatment of a wide range of \
languages without changing character-set. Work on Omega has \
ceased (the TeX Live package contains only support files); its \
compatible successor is aleph, which is itself also in major \
maintenance mode only. Ongoing projects developing Omega (and \
Aleph) ideas include Omega-2 and LuaTeX."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.svn77830"

RPM_NAME = "texlive-omegaware-2026.226.svn77830-61.2.noarch.rpm"
RPM_HASH = "bf03d5b639e107cda7cdb70b6f4386964efb5eba175578a422350212c850fd2ff8816843bab52f4ebac98cb39fbde421ecb0c1174049a14aef5b2b746274e7cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-odvicopy.1 \
man-odvitype.1 \
man-ofm2opl.1 \
man-opl2ofm.1 \
man-otangle.1 \
man-otp2ocp.1 \
man-outocp.1 \
man-ovf2ovp.1 \
man-ovp2ovf.1 \
texlive-omegaware"

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
texlive-omegaware-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
