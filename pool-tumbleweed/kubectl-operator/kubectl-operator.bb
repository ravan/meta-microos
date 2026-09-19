SUMMARY = "Manage Kubernetes Operators from the command line"
DESCRIPTION = "kubectl operator is a kubectl plugin that functions as a package manager for \
Operators in your cluster. It simplifies adding and removing Operator catalogs, \
and it has familiar commands for installing, uninstalling, and listing \
available and installed Operators. \
 \
NOTE: This plugin requires Operator Lifecycle Manager to be installed in your cluster. See the OLM installation instructions here: \
https://olm.operatorframework.io/docs/getting-started/"
LICENSE = "Apache-2.0"

PV = "0.6.0"

RPM_NAME = "kubectl-operator-0.6.0-1.10.aarch64.rpm"
RPM_HASH = "347fd82e6353f027d70e7989c01a014e56be50c29da18c9e23a527b14ce7cb644489d03f5df8dfed1662ff2c797b67ef6e05c36f14f5ff296e455a0188d0a74c"

RPROVIDES:${PN} += "kubectl-operator"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
