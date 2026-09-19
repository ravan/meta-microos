SUMMARY = "Busybox applets replacing telnet"
DESCRIPTION = "This package contains the symlinks to provide telnet with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-telnet-1.38.0-42.2.noarch.rpm"
RPM_HASH = "8653034654f91e66e88cfe76cbe723d47da8bb6a7f9fe9ad6bb4b3cf1e336702baf47cf2853dc5a6ab057a973703a8e26b3e9ba6e7b6ff3f47f5b29db54c4a68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-telnet"

RDEPENDS:${PN} += "busybox"

inherit rpm
