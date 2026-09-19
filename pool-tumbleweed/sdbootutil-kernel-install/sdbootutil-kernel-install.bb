SUMMARY = "Hook script for kernel-install"
DESCRIPTION = "Plugin script for kernel-install. Note: installation of this \
package may disable other plugin scripts that are incompatible."
LICENSE = "MIT"

PV = "1+git20260909.7cfa1f0"

RPM_NAME = "sdbootutil-kernel-install-1+git20260909.7cfa1f0-1.1.noarch.rpm"
RPM_HASH = "2f9ae19160f4e9d39ec391e1e2a04a445fd902483bf5a1e839bcefad85497ef0cc9db7eddbfbeb0f249e6cd3b3c615944ee347264b9b99deaec9380ce934874d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sdbootutil-kernel-install"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
sdbootutil \
udev"

inherit rpm
