SUMMARY = "Systemd default presets for SUSE distributions"
DESCRIPTION = "Default presets for systemd on SUSE based distributions."
LICENSE = "GPL-2.0-or-later"

PV = "15"

RPM_NAME = "systemd-presets-common-SUSE-15-48.2.noarch.rpm"
RPM_HASH = "41d1f1c4fa7f2f95e348ad5232a5d0e60211ecbbb28510af053801b8dc8967aba4cb857efc7699b9e398ef31c85caf35fe14864bb3f8b8c9136a13d13a20ec9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "systemd-presets-common-SUSE \
systemd-presets-common-SUSE-selinux-storeroot-etc-service"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
bash \
coreutils"

inherit rpm
