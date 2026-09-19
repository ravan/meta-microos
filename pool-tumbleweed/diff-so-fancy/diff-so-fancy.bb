SUMMARY = "Strives to make your diffs human readable"
DESCRIPTION = "diff-so-fancy strives to make your diffs human readable instead of machine readable. This helps improve code quality and helps you spot defects faster."
LICENSE = "MIT"

PV = "1.4.10"

RPM_NAME = "diff-so-fancy-1.4.10-2.2.noarch.rpm"
RPM_HASH = "ab52273c92746f0130cb791596d60d70e5c313f87cd6b3074267b2e448a7e27b59ba4185cfade51c176df59b80eb7a6670ee4405493e6d33d555a58ce32371d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "diff-so-fancy \
perl-DiffHighlight"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
perl"

inherit rpm
