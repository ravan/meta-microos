SUMMARY = "Full disk encryption enrollment"
DESCRIPTION = "Systemd service and script for full disk encryption enrollment."
LICENSE = "MIT"

PV = "1+git20260909.7cfa1f0"

RPM_NAME = "sdbootutil-enroll-1+git20260909.7cfa1f0-1.1.noarch.rpm"
RPM_HASH = "4a9877c3b4958216f1dc0e6362612ca71ca0931e4a987256fe65e421797c012409b679463226861a3ee470ea55f2bb4abbb164c2af4d1516f42cc08f61c7f849"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sdbootutil-enroll"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
sdbootutil"

inherit rpm
