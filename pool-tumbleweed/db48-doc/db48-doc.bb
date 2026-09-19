SUMMARY = "Documentation for Berkeley DB"
DESCRIPTION = "The Berkeley DB Database is a programmatic toolkit that provides \
database support for applications. \
 \
This package contains the documentation."
LICENSE = "BSD-3-Clause & Sleepycat"

PV = "4.8.30"

RPM_NAME = "db48-doc-4.8.30-48.3.noarch.rpm"
RPM_HASH = "249ec4c4ae70772320dbbb20fef8d81d1a30879eb045213e52bcb2eea1e018a6d96afe14e176a9d229464e8fcb2e6143f0be87f08a507b28b790efb7677372e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "db-doc \
db-utils-doc \
db48-doc"

RDEPENDS:${PN} += ""

inherit rpm
