SUMMARY = "Kubernetes client tools"
DESCRIPTION = "Kubernetes client tools like kubectl."
LICENSE = "Apache-2.0"

PV = "1.35.8"

RPM_NAME = "kubernetes1.35-client-1.35.8-2.1.aarch64.rpm"
RPM_HASH = "a46b8bb425fbc52e05eaed63ebff0143ce4548d2c26ed353e6a157e2a6c4dc9a0e2402e488646a8c63f64636107b77794dffda2e399c5df21c1f7803d32c5359"

RPROVIDES:${PN} += "kubernetes-client-provider \
kubernetes1.35-client"

RDEPENDS:${PN} += "kubernetes1.35-client-common \
update-alternatives"

inherit rpm
