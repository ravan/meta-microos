SUMMARY = "Dire Wolf documentation"
DESCRIPTION = "Documentation files for Dire Wolf"
LICENSE = "GPL-2.0-only"

PV = "1.8.1"

RPM_NAME = "direwolf-doc-1.8.1-2.6.noarch.rpm"
RPM_HASH = "5bc03201a23d14c11c938eec2ad6ddd225539e4067ea8a5defaa19a1d7f729afd235da359aaf2929d3774465a81e2c03cd138fa503f553a3fd2e41fb706d9727"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "direwolf-doc"

RDEPENDS:${PN} += "direwolf"

inherit rpm
