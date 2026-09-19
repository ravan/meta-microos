SUMMARY = "Continuously update packages from devel:openQA"
DESCRIPTION = "Use this package to install and enable a systemd service for continuously \
upgrading the system if devel:openQA packages are stable and contain updates. It \
is complementary to auto-update which also reboots the system and does updates \
regardless of whether devel:openQA contains updates."
LICENSE = "GPL-2.0-or-later"

PV = "5.1788605562.29b45941"

RPM_NAME = "openQA-continuous-update-5.1788605562.29b45941-1.1.aarch64.rpm"
RPM_HASH = "f15c5b6674a3eb523466df6a26a4c36e1621d35a77435b7f98aa23b4a447580e32401faf0fe237dc031d9cd06453444455c5e76d32eed5918433f34fe085338a"

RPROVIDES:${PN} += "openQA-continuous-update"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
curl \
openQA-common"

inherit rpm
