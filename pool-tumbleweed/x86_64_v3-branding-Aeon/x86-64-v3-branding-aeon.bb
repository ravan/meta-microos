SUMMARY = "Aeon configuration for x86_64_v3 support"
DESCRIPTION = "Aeon configuration for ensuring x86_64_v3 binaries are installed and updated"
LICENSE = "MIT"

PV = "20240429"

RPM_NAME = "x86_64_v3-branding-Aeon-20240429-2.9.noarch.rpm"
RPM_HASH = "055e61a7f8b7c16465433a8da5cc1b17ab5d146dcd454cef0c51bae34c66a6d43af33ce0c71de1aeab0f116529b18c971209d2dc199575afd7610c0ff865847a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "x86-64-v3-branding-Aeon"

RDEPENDS:${PN} += "/usr/bin/sh \
transactional-update"

inherit rpm
