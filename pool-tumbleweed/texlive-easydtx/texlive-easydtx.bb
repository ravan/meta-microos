SUMMARY = "A simplified DTX format"
DESCRIPTION = "EasyDTX is a variant of the DTX format which eliminates the \
need for all those pesky 'macrocode' environments. Any line \
introduced by a single comment counts as documentation, and \
documentation lines may be indented. An .edtx file is converted \
to a .dtx by a little Perl script called edtx2dtx. There is \
also a rudimentary Emacs mode, implemented in \
easydoctex-mode.el, which takes care of fontification, \
indentation, and forward and inverse search."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.0.0.2.0svn72952"

RPM_NAME = "texlive-easydtx-2026.226.0.0.2.0svn72952-61.4.noarch.rpm"
RPM_HASH = "a01d23a217a2ec398c4b2fdcbb63012a198fb247ad1b2f96729d0b6e235f25e6e182c92051782d5a074c4fcbfd2a7f34f4b92ec35c9db2700af1b27479f206ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-easydtx"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Getopt--Long \
perl-strict \
sed \
texlive \
texlive-easydtx-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
