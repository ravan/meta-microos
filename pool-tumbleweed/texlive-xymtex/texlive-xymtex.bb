SUMMARY = "Typesetting chemical structures"
DESCRIPTION = "XyMTeX is a set of packages for drawing a wide variety of \
chemical structural formulas in a way that reflects their \
structure. The package provides three output modes: 'LaTeX', \
'PostScript' and 'PDF'. XyMTeX's commands have a systematic set \
of arguments for specifying substituents and their positions, \
endocyclic double bonds, and bond patterns. In some cases there \
are additional arguments for specifying hetero-atoms on the \
vertices of heterocycles. It is believed that this systematic \
design allows XyMTeX to operate as a practical \
(device-independent) tool for use with LaTeX."
LICENSE = "LPPL-1.0"

PV = "2026.226.5.06svn32182"

RPM_NAME = "texlive-xymtex-2026.226.5.06svn32182-59.4.noarch.rpm"
RPM_HASH = "747ae25e4f0d49983ddefdaec51b6415ea4ab2cdc043bd3852ba05a1d49d46d8408072e006241d90a6d385ad9d2c433e320e0a39b4e3d3491bb1bfab152c3a22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-aliphat.sty \
tex-assurechemist.sty \
tex-assurelatexmode.sty \
tex-bondcolor.sty \
tex-carom.sty \
tex-ccycle.sty \
tex-chemist.sty \
tex-chemstr.sty \
tex-chemtimes.sty \
tex-chmst-pdf.sty \
tex-chmst-ps.sty \
tex-fusering.sty \
tex-hcycle.sty \
tex-hetarom.sty \
tex-hetaromh.sty \
tex-lewisstruc.sty \
tex-locant.sty \
tex-lowcycle.sty \
tex-methylen.sty \
tex-polymers.sty \
tex-sizeredc.sty \
tex-steroid.sty \
tex-xymtex.sty \
tex-xymtexpdf.sty \
tex-xymtexps.sty \
tex-xymtx-pdf.sty \
tex-xymtx-ps.sty \
texlive-xymtex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-epic.sty \
tex-pgfcore.sty \
tex-pst-coil.sty \
tex-pstricks.sty \
tex-tikz.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
