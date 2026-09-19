SUMMARY = "Kubernetes operator for easier RBAC management"
DESCRIPTION = "RBAC Manager is designed to simplify authorization in Kubernetes. \
 \
This is an operator that supports declarative configuration for RBAC with new \
custom resources. \
 \
Instead of managing role bindings or service accounts directly, you can specify \
a desired state and RBAC Manager will make the necessary changes to achieve \
that state."
LICENSE = "Apache-2.0"

PV = "1.10.2"

RPM_NAME = "rbac-manager-1.10.2-1.1.aarch64.rpm"
RPM_HASH = "555bd51c5c3b4f92baff1bfb1160c2bd63aa2714d5b8f0a5fd6c639e76a455b39c488dfea21f268decd6eb58592c6a46a5b1f9da25cd1c9b3eb1750cca81c449"

RPROVIDES:${PN} += "rbac-manager"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
