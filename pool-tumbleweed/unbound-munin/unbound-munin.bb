SUMMARY = "Plugin for the munin / munin-node monitoring package"
DESCRIPTION = "Unbound is a validating, recursive, and caching DNS(SEC) resolver. \
 \
This package holds the plugin for the munin / munin-node monitoring package"
LICENSE = "BSD-3-Clause"

PV = "1.26.0"

RPM_NAME = "unbound-munin-1.26.0-2.1.noarch.rpm"
RPM_HASH = "658e6211d968c7dcdfd11cc183c28b360efc139b93461ad7d24000f6a56474729719f315558b4b5b0c2ccd034af11072657efb80b715fb3d4c3c22ec00fd0e76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-unbound-munin \
unbound-munin"

RDEPENDS:${PN} += "/usr/bin/sh \
bc \
munin-node \
unbound"

inherit rpm
