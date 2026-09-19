SUMMARY = "Show progress for cp, mv, dd, etc"
DESCRIPTION = "Show progress for cp, mv, dd, etc."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-progress-2.1.5-4.7.noarch.rpm"
RPM_HASH = "99297597c063da0496a3e609ae1037df9fafbe4e9002000ead4c30598e1adf491c70ccaa0ed134b307ca37c4fd157947fd0b2fc7fdbd6767a4cfe73659eabdfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-progress"

RDEPENDS:${PN} += "bumblebee-status \
progress"

inherit rpm
