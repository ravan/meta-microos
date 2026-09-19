SUMMARY = "Plymouth 'Breeze' theme"
DESCRIPTION = "This package contains the 'breeze' boot splash theme for Plymouth."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "plymouth-theme-breeze6-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "3359c5f541e164377f73b40ada9602fc619c84de042f6c2a83bc822db95d605a59e0cece0261577afa39a92f90a6e027f8f9fd35be6b89ba7079d4f11105cac1"

RPROVIDES:${PN} += "plymouth-theme-breeze \
plymouth-theme-breeze6"

RDEPENDS:${PN} += "plymouth-plugin-breeze \
plymouth-plugin-label-ft \
plymouth-plugin-script \
plymouth-scripts"

inherit rpm
