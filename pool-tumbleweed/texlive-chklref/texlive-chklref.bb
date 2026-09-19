SUMMARY = "Check for problems with labels in LaTeX"
DESCRIPTION = "It is quite common that after modifying a TeX file, many unused \
labels remain in it. The purpose of chklref is to automatically \
find these useless labels. It also looks for 'non starred' \
mathematical environments with no labels and advises the user \
to use a starred version instead."
LICENSE = "GPL-2.0-or-later"

PV = "2026.226.3.1.2svn52649"

RPM_NAME = "texlive-chklref-2026.226.3.1.2svn52649-60.2.noarch.rpm"
RPM_HASH = "e4c6a73e273f6b8b05d86609928a600cdbedc1018c09318186f8c1f3c884beef5dfab9078fbc5c580c6b6f26e08cbdc3c36c64392355876289b8efe628b87643"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chklref.sty \
texlive-chklref"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Cwd \
perl-File--Basename \
perl-Getopt--Long \
perl-strict \
perl-warnings \
sed \
tex-afterpackage.sty \
tex-auxhook.sty \
tex-currfile.sty \
texlive \
texlive-chklref-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
