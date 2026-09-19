SUMMARY = "Plymouth 'breeze' plugin"
DESCRIPTION = "This package contains the 'breeze' boot splash plugin for Plymouth. \
It features an extensible, scriptable boot splash language that simplifies \
the process of designing custom boot splash themes."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "plymouth-plugin-breeze-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "aabce7879abff614b8e5ded03e8e2dc7a90e171705593b7faa5b20f6096761ee1089e4b562bce1436fa92e9939f9a96cd8f776ccd11a4e6178ebda4df4cc661d"

RPROVIDES:${PN} += "plymouth-plugin-breeze \
plymouth-theme-breeze-plugin-breeze"

RDEPENDS:${PN} += "libc.so.6 \
libm.so.6 \
libply-splash-core.so.5 \
libply.so.5"

inherit rpm
