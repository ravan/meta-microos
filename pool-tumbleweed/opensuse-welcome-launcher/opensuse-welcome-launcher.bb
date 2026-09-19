SUMMARY = "Welcome utility for openSUSE"
DESCRIPTION = "A simple wrapper to spawn relevant welcome tool on given desktop"
LICENSE = "GPL-3.0-or-later & MIT"

PV = "1.0"

RPM_NAME = "opensuse-welcome-launcher-1.0-4.3.noarch.rpm"
RPM_HASH = "a30f6a9263189ea73bfdbef7a9225e95aa7171ebf1e7a4b98036b8a1f5bb77a190d63e403c70dc49a50be9cf33e56298a63c5429a73d1292346a644f1d384616"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "opensuse-welcome-launcher"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
