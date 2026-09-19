SUMMARY = "Computer Modern Unicode font family"
DESCRIPTION = "Computer Modern Unicode fonts, converted from Metafont sources \
using mftrace with autotrace backend and fontforge. Some \
characters in several fonts are copied from Blue Sky type 1 \
fonts released by AMS. Currently the fonts contain glyphs from \
Latin (Metafont ec, tc, vnr), Cyrillic (lh), Greek (cbgreek \
when available) code sets and IPA extensions (from tipa). This \
font set contains 33 fonts. This archive contains AFM, PFB and \
OTF versions; the OTF version of the Computer Modern Unicode \
fonts works with TeX engines that directly support OpenType \
features, such as XeTeX and LuaTeX."
LICENSE = "OFL-1.1"

PV = "2026.226.0.0.7.0svn58661"

RPM_NAME = "texlive-cm-unicode-2026.226.0.0.7.0svn58661-60.2.noarch.rpm"
RPM_HASH = "9756e6f8a011e6287283d40f0febad06c89995a8108780fcd219a632575e527121cd5f97692d1b0fd1fe6c33202f11e346b740e200ca75ebf19cfae6fd49b954"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cmu-ec.enc \
tex-cmu-ecsc.enc \
tex-cmu-g.enc \
tex-cmu-gsc.enc \
tex-cmu-la.enc \
tex-cmu-lasc.enc \
tex-cmu-lb.enc \
tex-cmu-lc.enc \
tex-cmu-ld.enc \
tex-cmu-rx.enc \
tex-cmu-tc.enc \
tex-cmu-tipa.enc \
tex-cmu-tipx.enc \
tex-cmu-ux.enc \
tex-cmu-uxsc.enc \
tex-cmu-vn.enc \
tex-cmu.map \
texlive-cm-unicode"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-cm-unicode-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
