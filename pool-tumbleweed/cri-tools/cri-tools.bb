SUMMARY = "CLI and validation tools for Kubelet Container Runtime Interface"
DESCRIPTION = "cri-tools provides a series of debugging and validation tools for \
Kubelet CRI, which includes: \
 \
- crictl: CLI for kubelet CRI \
- critest: validation test suites for kubelet CRI"
LICENSE = "Apache-2.0"

PV = "1.37.0"

RPM_NAME = "cri-tools-1.37.0-1.1.aarch64.rpm"
RPM_HASH = "377a31b4dc7185f9a8d48b5570d289ccebff4e7b8290d4fb6c59b839a5274b1c9467b21d82d73e0f4353e08147f36e5a49014d9aa135a52fe9a3d7044831cc6c"

RPROVIDES:${PN} += "config-cri-tools \
cri-tools"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
