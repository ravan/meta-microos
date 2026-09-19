SUMMARY = "Filter clutter from the output of a TeX run"
DESCRIPTION = "The package provides a small Perl script to filter the online \
output from a TeX run, attempting to show only those messages \
which probably deserve some change in the source. The TeX \
invocation itself need not change."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "2026.227.1.54svn77286"

RPM_NAME = "texlive-texfot-2026.227.1.54svn77286-62.2.noarch.rpm"
RPM_HASH = "2d7138735aa013811d8ff845664687f26f29addc380a949f28789dd3c4a6b18bd644b205519f7150a4ebd479db64684c1acfaea08bec1fcafca809bd5b1ecc61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texfot"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Getopt--Long \
perl-IO--File \
perl-IPC--Open3 \
perl-Pod--Usage \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-texfot-bin"

inherit rpm
