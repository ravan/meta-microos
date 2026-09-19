SUMMARY = "Example server job configs"
DESCRIPTION = "Example server job configs"
LICENSE = "GPL-3.0-only"

PV = "1.0.0"

RPM_NAME = "kanku-config-example-jobs-1.0.0-2.2.noarch.rpm"
RPM_HASH = "b181f0bc970ae3ca7259dd669085a63f372c9a2e1297e07270e96c1c6e23a253bd6e3028d3a3bae71d077d7455fb3689189f0f04e16f2b45b5abb4c32692a708"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kanku-config-example-jobs"

RDEPENDS:${PN} += "/usr/bin/sh \
kanku-common"

inherit rpm
