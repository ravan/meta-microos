SUMMARY = "KIWI - host requirements for configuring bootloaders"
DESCRIPTION = "Host setup helper to pull in all packages required/useful on \
the build host for configuring bootloaders on images."
LICENSE = "GPL-3.0-or-later"

PV = "10.3.11"

RPM_NAME = "kiwi-systemdeps-bootloaders-10.3.11-1.1.aarch64.rpm"
RPM_HASH = "7f45e5fa986c918c901bc2a7299d2e65d97566c01d7dbbcc9ba4611b405f82eef66a4f14950c43fd9e3766bcd80cf27dd47c5edc52cb600adb9201a6ec63434d"

RPROVIDES:${PN} += "kiwi-systemdeps-bootloaders"

RDEPENDS:${PN} += "kiwi-systemdeps-core \
u-boot-tools"

inherit rpm
