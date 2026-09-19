SUMMARY = "Support for Cyrillic fonts in LaTeX"
DESCRIPTION = "This bundle of macros files provides macro support (including \
font encoding macros) for the use of Cyrillic characters in \
fonts encoded under the T2* and X2 encodings. These encodings \
cover (between them) pretty much every language that is written \
in a Cyrillic alphabet. This directory is part of the LaTeX \
'required' distribution."
LICENSE = "LPPL-1.0"

PV = "2026.226.svn71408"

RPM_NAME = "texlive-cyrillic-2026.226.svn71408-61.2.noarch.rpm"
RPM_HASH = "a0903413b54cbc9e5e0ccc9211c143417f9ffeb7e011096eb58b84443802a30f61482cbe5a7a4fb475012723e3aef011cbab57c29c51171a88cac202d0cd6f74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cp1251.def \
tex-cp855.def \
tex-cp866.def \
tex-cp866av.def \
tex-cp866mav.def \
tex-cp866nav.def \
tex-cp866tat.def \
tex-ctt.def \
tex-dbk.def \
tex-iso88595.def \
tex-isoir111.def \
tex-koi8-r.def \
tex-koi8-ru.def \
tex-koi8-u.def \
tex-lcy.sty \
tex-lcyccr.fd \
tex-lcycmbr.fd \
tex-lcycmdh.fd \
tex-lcycmfib.fd \
tex-lcycmfr.fd \
tex-lcycmr.fd \
tex-lcycmss.fd \
tex-lcycmtl.fd \
tex-lcycmtt.fd \
tex-lcycmvtt.fd \
tex-lcydefs.tex \
tex-lcyenc.def \
tex-lcylcmss.fd \
tex-lcylcmtt.fd \
tex-maccyr.def \
tex-macukr.def \
tex-mik.def \
tex-mls.def \
tex-mnk.def \
tex-mos.def \
tex-ncc.def \
tex-ot2ccr.fd \
tex-ot2cmbr.fd \
tex-ot2cmdh.fd \
tex-ot2cmfib.fd \
tex-ot2cmfr.fd \
tex-ot2cmr.fd \
tex-ot2cmss.fd \
tex-ot2cmtl.fd \
tex-ot2cmtt.fd \
tex-ot2cmvtt.fd \
tex-ot2enc.def \
tex-ot2lcmss.fd \
tex-ot2lcmtt.fd \
tex-ot2wlcyr.fd \
tex-ot2wlcyss.fd \
tex-ot2wncyr.fd \
tex-ot2wncyss.fd \
tex-pt154.def \
tex-pt254.def \
tex-t2accr.fd \
tex-t2acmbr.fd \
tex-t2acmdh.fd \
tex-t2acmfib.fd \
tex-t2acmfr.fd \
tex-t2acmr.fd \
tex-t2acmss.fd \
tex-t2acmtl.fd \
tex-t2acmtt.fd \
tex-t2acmvtt.fd \
tex-t2aenc.def \
tex-t2alcmss.fd \
tex-t2alcmtt.fd \
tex-t2bccr.fd \
tex-t2bcmbr.fd \
tex-t2bcmdh.fd \
tex-t2bcmfib.fd \
tex-t2bcmfr.fd \
tex-t2bcmr.fd \
tex-t2bcmss.fd \
tex-t2bcmtl.fd \
tex-t2bcmtt.fd \
tex-t2bcmvtt.fd \
tex-t2benc.def \
tex-t2blcmss.fd \
tex-t2blcmtt.fd \
tex-t2cccr.fd \
tex-t2ccmbr.fd \
tex-t2ccmdh.fd \
tex-t2ccmfib.fd \
tex-t2ccmfr.fd \
tex-t2ccmr.fd \
tex-t2ccmss.fd \
tex-t2ccmtl.fd \
tex-t2ccmtt.fd \
tex-t2ccmvtt.fd \
tex-t2cenc.def \
tex-t2clcmss.fd \
tex-t2clcmtt.fd \
tex-x2ccr.fd \
tex-x2cmbr.fd \
tex-x2cmdh.fd \
tex-x2cmfib.fd \
tex-x2cmfr.fd \
tex-x2cmr.fd \
tex-x2cmss.fd \
tex-x2cmtl.fd \
tex-x2cmtt.fd \
tex-x2cmvtt.fd \
tex-x2enc.def \
tex-x2lcmss.fd \
tex-x2lcmtt.fd \
texlive-cyrillic"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontenc.sty \
texlive \
texlive-cyrillic-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
