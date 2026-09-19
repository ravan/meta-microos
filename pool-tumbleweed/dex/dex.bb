SUMMARY = "DesktopEntry Execution"
DESCRIPTION = "A simple utility to handle XDG autostart entries."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.0"

RPM_NAME = "dex-0.9.0-1.17.noarch.rpm"
RPM_HASH = "7c955ac67b5d9a1d8436389b39aaa5d26aeafc2b106397f623135c916c357f21229c4d88ba638254d7a939dd744f1b0ca18403a26bd51406db8885c689552f17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dex"

RDEPENDS:${PN} += "/usr/bin/env \
python3"

inherit rpm
