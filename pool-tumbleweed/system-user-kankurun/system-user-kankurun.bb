SUMMARY = "System user and group kankurun/kanku"
DESCRIPTION = "This package provides the system account 'kankurun' and group 'kanku'."
LICENSE = "GPL-3.0-only"

PV = "1.0.0"

RPM_NAME = "system-user-kankurun-1.0.0-2.2.noarch.rpm"
RPM_HASH = "292335d88314711402fc0647bf8361385a078e27c6b4da35846dd737010bc5769f5d86bfc6b43c5f016cdd5f03b59351863a19f5d284ce20c25b4761517dfb24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-kanku \
group-kankurun \
system-user-kankurun \
user-kankurun"

RDEPENDS:${PN} += "/usr/bin/sh \
shadow \
sysuser-shadow"

inherit rpm
