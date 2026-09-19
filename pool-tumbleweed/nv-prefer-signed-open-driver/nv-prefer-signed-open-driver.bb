SUMMARY = "Prefer the signed open driver when installing CUDA"
DESCRIPTION = "By installing this package, the signed NVIDIA open driver built by SUSE will be preferred during installation \
of CUDA components. \
Simply run: `zypper install --no-recommends cuda-runtime-<version> nv-prefer-signed-open-driver`"
LICENSE = "GPL-2.0-only & MIT"

PV = "580.178.04"

RPM_NAME = "nv-prefer-signed-open-driver-580.178.04-1.5.aarch64.rpm"
RPM_HASH = "c4714c682ba5091212ec17ca57ad5c29faa113e6fcd3e51b92ae6fc9adecd34e6bcbafeea2499a6fad3ba398b8f2675ab4c6d8ca5ced52eb16b075fec41f39be"

RPROVIDES:${PN} += "nv-prefer-signed-open-driver"

RDEPENDS:${PN} += "nvidia-open-driver-G06-signed-cuda-kmp"

inherit rpm
