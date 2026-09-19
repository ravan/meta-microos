SUMMARY = "Basic TeX Live infrastructure"
DESCRIPTION = "This package contains the files needed to get tlmgr running: \
perl modules, xz binaries, plus (sometimes) tar, wget, lz4, and \
various other support files. This package also represents the \
tlcritical recovery scripts. The standalone installer is close, \
but not the same; it's defined in 00texlive.installer."
LICENSE = "LPPL-1.0"

PV = "2026.227.svn78218"

RPM_NAME = "texlive-texlive.infra-2026.227.svn78218-62.2.noarch.rpm"
RPM_HASH = "c104863365c68671b163390346b983d1041e6b5347f855ed0af60ea4edf0cf2e886d08dcb9e433c75583e9a23e72c9574451e162679b1a903c5e864dc6fc6bc6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-TeXLive--TLConfFile \
perl-TeXLive--TLConfig \
perl-TeXLive--TLCrypto \
perl-TeXLive--TLPDB \
perl-TeXLive--TLPOBJ \
perl-TeXLive--TLPSRC \
perl-TeXLive--TLPaper \
perl-TeXLive--TLTREE \
perl-TeXLive--TLUtils \
perl-TeXLive--TLWinGoo \
perl-TeXLive--TeXCatalogue \
perl-TeXLive--TeXCatalogue--Entry \
tex-fmtutil-hdr.cnf \
tex-updmap-hdr.cfg \
texlive-texlive.infra"

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
texlive-scripts \
texlive-scripts-bin"

inherit rpm
