SUMMARY = "Rsync wrapper to retry on transfer errrors"
DESCRIPTION = "Rsync wrapper to retry on transfer errrors"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "0.7.0"

RPM_NAME = "perl-App-rsync-retry-0.7.0-1.7.noarch.rpm"
RPM_HASH = "6584e9afb226b5f6b547919aa07ceefdc4f2965d68d36ca75c6f929acd21a9fd55b6308903a18a51164a9d9f99b6dacb873f382349e6f92158938ec715e75d9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl-App--rsync--retry \
perl-App-rsync-retry"

RDEPENDS:${PN} += "/usr/bin/perl \
perl--MODULE-COMPAT-5.44.0 \
perl-File--Which \
perl-Getopt--Long"

inherit rpm
