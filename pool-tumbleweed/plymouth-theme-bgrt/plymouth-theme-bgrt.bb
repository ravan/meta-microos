SUMMARY = "Plymouth 'bgrt' theme"
DESCRIPTION = "This package contains the 'bgrt' boot splash theme for \
Plymouth."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-theme-bgrt-22.02.122+94.4bd41a3-20.6.noarch.rpm"
RPM_HASH = "3a8df9ceee2c5a46b16a6263a1ee4f6d9588145622b5ef73e4ab46589fdf1cc17bbb73166384a2dc78c1bd0a7967c0044a078ec27f7bfc8914044b25d45890c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-theme-bgrt"

RDEPENDS:${PN} += "plymouth-plugin-two-step \
plymouth-scripts \
plymouth-theme-spinner"

inherit rpm
