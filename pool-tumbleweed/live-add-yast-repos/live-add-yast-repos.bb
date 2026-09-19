SUMMARY = "A script to add the repos from control.xml to the system"
DESCRIPTION = "This package contains a script which adds all defined repositories from \
control.xml (using extra_url) to the system."
LICENSE = "GPL-2.0-only"

PV = "1.0"

RPM_NAME = "live-add-yast-repos-1.0-6.15.aarch64.rpm"
RPM_HASH = "3050f725866b9550a179011a9a6f8a9a0ea4fa77ef1e119628bbbfb084983175f84f3ffb39e8411521a2b65e7dcae209d50febdbb5d0d894d26aeaaa5859050b"

RPROVIDES:${PN} += "live-add-yast-repos"

RDEPENDS:${PN} += "/usr/bin/sh \
zypper"

inherit rpm
