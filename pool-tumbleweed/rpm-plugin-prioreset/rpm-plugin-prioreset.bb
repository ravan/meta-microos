SUMMARY = "Rpm plugin for resetting scriptlet priorities for SysV init"
DESCRIPTION = "Rpm plugin for resetting scriptlet priorities for SysV init."
LICENSE = "GPL-2.0-or-later"

PV = "4.20.1"

RPM_NAME = "rpm-plugin-prioreset-4.20.1-10.1.aarch64.rpm"
RPM_HASH = "4842503c69090fb1c2bebfbb246c2351862aeae911153885dd1a22e02068d555e32a2feb7ad8cea0be6b0a68f3e106e0e3d83e68cb8c09912a375496b81df06c"

RPROVIDES:${PN} += "rpm-plugin-prioreset"

RDEPENDS:${PN} += "rpm"

inherit rpm
