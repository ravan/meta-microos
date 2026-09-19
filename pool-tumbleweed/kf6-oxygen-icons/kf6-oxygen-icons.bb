SUMMARY = "Oxygen Icon Theme"
DESCRIPTION = "This package contains the non-scalable icons of the Oxygen icon theme."
LICENSE = "LGPL-3.0-only"

PV = "6.30.0"

RPM_NAME = "kf6-oxygen-icons-6.30.0-1.1.noarch.rpm"
RPM_HASH = "5f229f3b76bd3359a965802dbdb6d8d9c5c3cb550c225acaee84fbf5cc673faf961a84dc0cf60f3a1ac578b0f2883a2911bbf97183b8488e32a1d36e97050a64"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kf6-oxygen-icons \
oxygen-icon-theme \
oxygen5-icon-theme"

RDEPENDS:${PN} += "hicolor-icon-theme"

inherit rpm
