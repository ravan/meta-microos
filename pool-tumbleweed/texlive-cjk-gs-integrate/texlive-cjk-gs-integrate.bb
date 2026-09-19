SUMMARY = "Tools to integrate CJK fonts into Ghostscript"
DESCRIPTION = "This script searches a list of directories for CJK fonts, and \
makes them available to an installed Ghostscript. In the \
simplest case, with sufficient privileges, a run without \
arguments should result in a complete setup of Ghostscript."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.20210625.0svn59705"

RPM_NAME = "texlive-cjk-gs-integrate-2026.226.20210625.0svn59705-60.2.noarch.rpm"
RPM_HASH = "7be2af248451423e9297bc27ca9fe531eae957f45eac5ec74a08d900dbdf40cd7b6e9cadc55b5a54df93bac07673bd9adc1d7fbb67e1d2bf6b6211224bdb5b10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cjkgs-adobe.dat \
tex-cjkgs-apple.dat \
tex-cjkgs-arphic.dat \
tex-cjkgs-bizud.dat \
tex-cjkgs-cjkuni.dat \
tex-cjkgs-dynacomware.dat \
tex-cjkgs-fandol.dat \
tex-cjkgs-fontworks.dat \
tex-cjkgs-founder.dat \
tex-cjkgs-hancom.dat \
tex-cjkgs-haranoaji.dat \
tex-cjkgs-heisei.dat \
tex-cjkgs-hiragino.dat \
tex-cjkgs-ipa.dat \
tex-cjkgs-kozuka.dat \
tex-cjkgs-macos-removeonly.dat \
tex-cjkgs-microsoft.dat \
tex-cjkgs-mogamobo.dat \
tex-cjkgs-monotype.dat \
tex-cjkgs-morisawa.dat \
tex-cjkgs-nanum.dat \
tex-cjkgs-notosans.dat \
tex-cjkgs-notoserif.dat \
tex-cjkgs-removeonly.dat \
tex-cjkgs-ryokana.dat \
tex-cjkgs-sazanami.dat \
tex-cjkgs-sinotype.dat \
tex-cjkgs-solaris.dat \
tex-cjkgs-sourcehansans.dat \
tex-cjkgs-sourcehanserif.dat \
tex-cjkgs-toppan.dat \
tex-cjkgs-typebank.dat \
tex-cjkgs-ume.dat \
tex-cjkgs-unfonts.dat \
tex-cjkgs-wenquanyi.dat \
tex-cjkgs-yu-osx.dat \
tex-cjkgs-yu-win.dat \
texlive-cjk-gs-integrate"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Cwd \
perl-Encode \
perl-Encode--Alias \
perl-File--Basename \
perl-File--Path \
perl-Getopt--Long \
perl-feature \
perl-strict \
perl-utf8 \
perl-warnings \
sed \
texlive \
texlive-cjk-gs-integrate-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
