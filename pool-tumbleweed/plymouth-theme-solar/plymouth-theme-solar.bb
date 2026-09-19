SUMMARY = "Plymouth 'Solar' theme"
DESCRIPTION = "This package contains the 'Solar' boot splash theme for \
Plymouth. It features a blue flamed sun with animated solar flares."
LICENSE = "GPL-2.0-or-later"

PV = "22.02.122+94.4bd41a3"

RPM_NAME = "plymouth-theme-solar-22.02.122+94.4bd41a3-20.6.noarch.rpm"
RPM_HASH = "2f227ca1fa6e0c4dddd60408fe079a4496be80374baad21d1f6a24eda5406b50e5f7dff078b5b7ce2faed2b7ede65ea03242b46e21ae6c1e66779595db214b2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plymouth-theme-solar"

RDEPENDS:${PN} += "/usr/bin/sh \
plymouth-plugin-space-flares \
plymouth-scripts"

inherit rpm
