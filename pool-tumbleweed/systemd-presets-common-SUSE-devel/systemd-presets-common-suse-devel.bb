SUMMARY = "Devel package for systemd presets"
DESCRIPTION = "This package provides the needed files to build preset \
packages"
LICENSE = "GPL-2.0-or-later"

PV = "15"

RPM_NAME = "systemd-presets-common-SUSE-devel-15-48.2.noarch.rpm"
RPM_HASH = "6cb86e009b6a8adbf2f93122f535d60134c976c9dbd8378efe545c86f0d097ff956d2c6ff8026f0b21e4498180dbb2812a5d9e6f1f67126b271bf78ab3a559b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rpm-macro-systemd-preset-force-post \
rpm-macro-systemd-preset-post \
rpm-macro-systemd-preset-posttrans \
rpm-macro-systemd-preset-pre \
rpm-macro-systemd-preset-requires \
rpm-macro-systemd-user-preset-force-post \
rpm-macro-systemd-user-preset-post \
rpm-macro-systemd-user-preset-posttrans \
rpm-macro-systemd-user-preset-pre \
systemd-presets-common-SUSE-devel"

RDEPENDS:${PN} += "systemd-presets-common-SUSE"

inherit rpm
