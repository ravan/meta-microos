SUMMARY = "Busybox applets replacing dos2unix"
DESCRIPTION = "This package contains the symlinks to provide dos2unix with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.38.0"

RPM_NAME = "busybox-dos2unix-1.38.0-42.2.noarch.rpm"
RPM_HASH = "20f4fda7012d8e972e9e99799258823eb2f41d5e482c97280e44f258826130aded7e18a1f871792923bc2b80921ce3a90ea911f8acc4734f07fc05b8e2e0f58d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-dos2unix"

RDEPENDS:${PN} += "busybox"

inherit rpm
