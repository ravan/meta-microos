SUMMARY = "A gamescope-based user session"
DESCRIPTION = "A gamescope-based user session. This sub-package only installs the \
common assets used by real sessions such as gamescope-session-steam \
or OpenGamepadUI."
LICENSE = "MIT"

PV = "1+git20250407.5030491"

RPM_NAME = "gamescope-session-plus-1+git20250407.5030491-1.4.noarch.rpm"
RPM_HASH = "fe89c3f46259b1cf59a47c4abdebc18d98b19d86b8b9bc472f64e874040b9c618abf25d047616f8b42dd6ef681ff26414ccdb2d9ef28429fe754c35c863a93b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gamescope-session \
gamescope-session-plus"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
gamescope \
python3"

inherit rpm
