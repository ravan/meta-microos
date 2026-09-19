SUMMARY = "HiSilicon based arm64 systems"
DESCRIPTION = "Device Tree files for HiSilicon based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "dtb-hisilicon-7.2.5-1.1.aarch64.rpm"
RPM_HASH = "17c166d5d8498f3953b10fe0a72ba5d97b01aa6c89be46f560be05a2a747433613e3384f38446ad633af85fbef9c26335144a00dde3d954b067412fa69052563"

RPROVIDES:${PN} += "dtb-hisilicon \
dtb-hisilicon64 \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
