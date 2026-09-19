SUMMARY = "PAM module for AppArmor change_hat"
DESCRIPTION = "The pam_apparmor module provides the means for any PAM applications \
that call pam_open_session() to automatically perform an AppArmor \
change_hat operation in order to switch to a user-specific security \
policy."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "5.0.2"

RPM_NAME = "pam_apparmor-5.0.2-2.1.aarch64.rpm"
RPM_HASH = "4344a720f48772eb6cab1254124fd8c5cdf91914d43f3021da5a02aa5fd1718572a9e9ded768daf60eaaef01fd44493408bf57fb622c92c1100c702994971a49"

RPROVIDES:${PN} += "pam-apparmor"

RDEPENDS:${PN} += "/usr/bin/sh \
libapparmor.so.1 \
libc.so.6 \
libpam.so.0 \
pam \
pam-config"

inherit rpm
