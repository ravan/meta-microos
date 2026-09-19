SUMMARY = "Udev rules to grant logged in users DDC/CI access"
DESCRIPTION = "ddcutil allows to control monitor settings like brightness or \
color settings. \
 \
This sub-package contains udev rules granting access to the \
DDC/CI bus of connected displays for regular (non-root) users \
who are currently logged in."
LICENSE = "GPL-2.0-or-later"

PV = "2.2.7"

RPM_NAME = "ddcutil-i2c-udev-rules-2.2.7-1.1.noarch.rpm"
RPM_HASH = "090de3a9fb429ed60f1b8ab94183a1831b583f064396b417c067353a4bd8462408bf6a7c326381a2940579908c0e7c6d5cc209d985df54795beaaf23ee6cc1d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ddcutil-/usr/lib/udev/rules.d/60-ddcutil.rules \
ddcutil-i2c-udev-rules"

RDEPENDS:${PN} += "libddcutil5"

inherit rpm
