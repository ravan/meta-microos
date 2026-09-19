SUMMARY = "Prefer the signed open driver when installing CUDA"
DESCRIPTION = "By installing this package, the signed NVIDIA open driver built by SUSE will be preferred during installation \
of CUDA components. \
Simply run: `zypper install cuda-tookit-<cuda_version> nvidia-compute-utils-G07 nv-prefer-signed-open-driver-G07`"
LICENSE = "GPL-2.0-only & MIT"

PV = "615.71.09"

RPM_NAME = "nv-prefer-signed-open-driver-G07-615.71.09-2.2.aarch64.rpm"
RPM_HASH = "f11779957f14b1cd5c8be92e1d6116203fd21bcfacec2c418849b8dfb9b73b2e60fa91c3b8f56f1d99ac1e0a1140c69e13d1b1aefcd28cf1aeb156604ebe395a"

RPROVIDES:${PN} += "nv-prefer-signed-open-driver-G07"

RDEPENDS:${PN} += "nvidia-open-driver-G07-signed-cuda-kmp"

inherit rpm
