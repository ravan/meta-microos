SUMMARY = "Cockpit SELinux package"
DESCRIPTION = "This package contains the Cockpit user interface integration with the \
utility setroubleshoot to diagnose and resolve SELinux issues."
LICENSE = "LGPL-2.1-or-later & GPL-3.0-or-later & MIT & CC-BY-SA-3.0 & BSD-3-Clause"

PV = "365"

RPM_NAME = "cockpit-selinux-365-2.1.noarch.rpm"
RPM_HASH = "334dcd8cc940a73e2f89f52e5947023eb14d150e29a57c8d45a448e25a07b9d6700e31a116c9b9ae3f02344e60bff5eaaf134daa8e6c79b4ea045091d8daafb7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cockpit-selinux"

RDEPENDS:${PN} += "cockpit-bridge \
cockpit-shell \
policycoreutils-python-utils \
setroubleshoot-server"

inherit rpm
