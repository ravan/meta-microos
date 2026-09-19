SUMMARY = "TeX Live infrastructure programs"
DESCRIPTION = "Includes install-tl, tl-portable, rungs, etc.; not needed for \
tlmgr to run but still ours. Not included in tlcritical."
LICENSE = "LPPL-1.0"

PV = "2026.227.svn78213"

RPM_NAME = "texlive-scripts-2026.227.svn78213-62.2.noarch.rpm"
RPM_HASH = "bf0476a8571f0cb58fdbb2d48d51a0e3c5a367433c2cd211487b05e696acfc7b7384dda709e1a5b975622541dd696563cb56bd02f9bc56a7205a8d4fc8cfa27c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-scripts \
tex-09fbbfac.enc \
tex-0ef0afca.enc \
tex-10037936.enc \
tex-1b6d048e.enc \
tex-71414f53.enc \
tex-74afc74c.enc \
tex-aae443f0.enc \
tex-b6a4d7c7.enc \
tex-base14flags.tex \
tex-bbad153f.enc \
tex-d9b29452.enc \
tex-dvipdfm35.map \
tex-dvips35.map \
tex-f7b6d320.enc \
tex-mathpple.map \
tex-mtex.enc \
tex-pdftex35.map \
tex-ps2pk35.map \
tex-updmap.cfg \
texlive-scripts"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
perl-Cwd \
perl-File--Basename \
perl-File--Find \
perl-File--Spec \
perl-File--Spec--Functions \
perl-Getopt--Long \
perl-Pod--Usage \
perl-TeXLive--TLUtils \
perl-TeXLive--TLWinGoo \
perl-strict \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts-bin \
texlive-scripts-extra \
texlive-texlive.infra"

inherit rpm
