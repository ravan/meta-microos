SUMMARY = "Udev rules for Android Debug Bridge"
DESCRIPTION = "This package provides udev rules to facilitate the use of devices \
with Android Debug Bridge (a command-line tool for communicating with \
a device to e.g. install or debug apps). \
The rules set adb* group ownership on /dev files and create symlinks \
such as /dev/android*."
LICENSE = "GPL-3.0-or-later"

PV = "20260423"

RPM_NAME = "android-udev-rules-20260423-1.2.noarch.rpm"
RPM_HASH = "3627d18c2cbef253d74078121a2c7a3c8e42e5743849797f1e7fb829daae6541268606a7b5367e3d8adbbff0dfcd575de13e7f23d2bd90b660200ac94a53e451"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "android-tools-udev \
android-udev-rules \
group-adbusers"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
