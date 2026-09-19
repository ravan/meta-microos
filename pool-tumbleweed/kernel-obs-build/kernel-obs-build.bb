SUMMARY = "package kernel and initrd for OBS VM builds"
DESCRIPTION = "This package is repackaging already compiled kernels to make them usable \
inside of Open Build Service (OBS) VM builds. An initrd with some basic \
kernel modules is generated as well, but further kernel modules can be \
loaded during build when installing the kernel package."
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "kernel-obs-build-7.2.5-1.1.aarch64.rpm"
RPM_HASH = "e461c0ce5278d9a8e18b36ffb970d4d7cac8c7396d79f82c4a56101dc9283f31ada55fe2ee85e067a4c88a6f923619cbf84bcdfa7a6adc2273908eb54e4895cb"

RPROVIDES:${PN} += "kernel-obs-build \
kernel-obs-build-srchash-6b7e8a968cce3b45e63d59e1d4981c9b7c5bc6b5"

RDEPENDS:${PN} += ""

inherit rpm
