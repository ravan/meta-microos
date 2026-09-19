SUMMARY = "Common files for Icinga Web and the Icinga CLI"
DESCRIPTION = "Manages common files for Icinga Web and the Icinga CLI."
LICENSE = "GPL-2.0-or-later"

PV = "2.13.0"

RPM_NAME = "icingaweb2-common-2.13.0-1.9.noarch.rpm"
RPM_HASH = "23bc9bc26fc1720bae9b4cb6c74e84f6d57225f0ca54c4c6266a71890026cb90691f10f8eeb106cfafdc798f8be3a4dae5e903abec3deab97a7731b5438acdc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-icingaweb2 \
icingaweb2-common"

RDEPENDS:${PN} += "/usr/bin/sh \
permissions \
shadow"

inherit rpm
