SUMMARY = "Python bindings for the remote Jenkins API"
DESCRIPTION = "This package provides Python bindings for the Jenkins Remote \
API. It currently supports management of: \
 * Project configuration \
 * Build control \
 * Slave node configuration"
LICENSE = "BSD-3-Clause"

PV = "1.8.3"

RPM_NAME = "python314-python-jenkins-1.8.3-1.2.noarch.rpm"
RPM_HASH = "98deaedcc08840d30f28a32c61e8415f8d09cbf0cdb84c6f25dbe85cb28e39c3d24c9b0edb12ca82fe8b8ba816148bf11e0e350639b630bdf42a0a24b248ea89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-python-jenkins \
python314-jenkins \
python314-python-jenkins \
python3dist-python-jenkins"

RDEPENDS:${PN} += "python-abi \
python314-multi-key-dict \
python314-pbr \
python314-requests"

inherit rpm
