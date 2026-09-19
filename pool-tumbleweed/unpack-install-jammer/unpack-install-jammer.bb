SUMMARY = "Pulls files out of InstallJammer generated executable installers"
DESCRIPTION = "It will search through your binary install blob, identify and extract the files \
buried within and drop them in a local directory. No higher permissions required, \
the only thing that is executed is the Perl script which lives up to Perl's \
reputation of easy inspection."
LICENSE = "GPL-3.0-only"

PV = "0.3.0"

RPM_NAME = "unpack-install-jammer-0.3.0-1.1.noarch.rpm"
RPM_HASH = "bead59dd341ec11aaa38c7d9a31e8b7cd5404a4f5c157b58d5507cdf2f63e9ff4b582f71434b1c2e825ec4f1a68874201fe49937f96349c4da02b9746f875890"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "unpack-install-jammer"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0 \
perl-Compress--Raw--Lzma \
perl-Data--Dump \
perl-File--HomeDir \
perl-Modern--Perl \
perl-Term--ProgressBar"

inherit rpm
