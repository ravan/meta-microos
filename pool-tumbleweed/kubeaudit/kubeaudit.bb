SUMMARY = "Audit your Kubernetes clusters against common security controls"
DESCRIPTION = "kubeaudit is a command line tool and a Go package to audit Kubernetes clusters for various different security concerns, such as: \
 \
- run as non-root \
- use a read-only root filesystem \
- drop scary capabilities, don't add new ones \
- don't run privileged \
- and more! \
 \
kubeaudit makes sure you deploy secure containers!"
LICENSE = "MIT"

PV = "0.22.2"

RPM_NAME = "kubeaudit-0.22.2-1.13.aarch64.rpm"
RPM_HASH = "1527611647547cce620c10c3cd59300454d823a12e1691fe7913dcce1ba1e1d72f57e5be09e57697ba9328312a6d1a64cf634bd6307e8523adcc794d4ce1d58a"

RPROVIDES:${PN} += "kubeaudit"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
