SUMMARY = "Kubernetes PreUpGrade (Checker)"
DESCRIPTION = "KubePug/Deprecations is intended to be a kubectl plugin, which: \
 \
- Downloads a swagger.json from a specific Kubernetes version \
- Parses this Json finding deprecation notices \
- Verifies the current kubernetes cluster or input files checking whether exists objects in this deprecated API Versions, allowing the user to check before migrating"
LICENSE = "Apache-2.0"

PV = "1.7.1"

RPM_NAME = "kubepug-1.7.1-2.12.aarch64.rpm"
RPM_HASH = "4b4f4e6d95a59c63c3f46657a79cc04ea6040bd4bddd3fa7713dcc88a5519a87879895cbbba2a48cd5d0a42ea8e1008d5f9f48c699d5d3b78ffe70bda27bf523"

RPROVIDES:${PN} += "kubectl-deprecations \
kubepug"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
