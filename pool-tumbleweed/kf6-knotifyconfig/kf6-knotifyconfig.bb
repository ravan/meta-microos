SUMMARY = "Configuration dialog for desktop notifications"
DESCRIPTION = "KNotifyConfig provides a configuration dialog for desktop notifications which \
can be embedded in your application."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-knotifyconfig-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "da48720ba78214f058e6a81e683646b5decd28fff0a364f5e31659d8140b6046d456382087264b48a8450f0df78453aeafc3f57a67d1334afbb98bb1d06894f2"

RPROVIDES:${PN} += "kf6-knotifyconfig"

RDEPENDS:${PN} += ""

inherit rpm
