SUMMARY = "HTML documentation of molequeue"
DESCRIPTION = "HTML documentation of molequeue."
LICENSE = "BSD-3-Clause"

PV = "0.9.0"

RPM_NAME = "molequeue-doc-0.9.0-4.3.noarch.rpm"
RPM_HASH = "b12b9250f3a6df10f5a28736fac4326a0bd92430191533b1a2585b52881e1e8321341a8fce7af992c31c2a4c98699f636e87d4718a77854a7730a2f96c7902e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "molequeue-doc"

RDEPENDS:${PN} += ""

inherit rpm
