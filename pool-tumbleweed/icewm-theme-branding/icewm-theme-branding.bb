SUMMARY = "Icewm theme branding"
DESCRIPTION = "This package is made for SLE or openSUSE customization of icewm, including \
the system default theme,background etc."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "1.2.6"

RPM_NAME = "icewm-theme-branding-1.2.6-2.4.noarch.rpm"
RPM_HASH = "a274769526a3176e30691de641c7df7abdf66d7f4cf69d160daad92ffcdf3614ef93d4af1228e0cd445b3b4782c4607d47f4ace0a7b0c618c7732c9f7ee32341"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-icewm-theme-branding \
icewm-configuration-files \
icewm-theme-branding"

RDEPENDS:${PN} += "/usr/bin/sh \
icewm"

inherit rpm
