SUMMARY = "Documentation for jts"
DESCRIPTION = "This package contains documentation for jts."
LICENSE = "EPL-1.0"

PV = "1.20.0"

RPM_NAME = "jts-doc-1.20.0-1.6.noarch.rpm"
RPM_HASH = "3d58501dae9f287200b64a47792f496a4bf75a6d75122c638acd9861c17cb2858cf7751441017c1f9738f69c5a6d6078a703b9f6df5052416f432dc98761c729"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jts-doc"

RDEPENDS:${PN} += ""

inherit rpm
