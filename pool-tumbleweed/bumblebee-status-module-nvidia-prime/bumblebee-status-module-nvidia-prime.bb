SUMMARY = "GPU selection for NVIDIA optimus using bbswitch"
DESCRIPTION = "GPU (nvidia/intel) selection for NVIDIA optimus laptops using bbswitch"
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-nvidia-prime-2.1.5-4.7.noarch.rpm"
RPM_HASH = "2443b057f2eb075d3ecb08b35c9e4f18118957e7acd853c70290a3af431ac15c467f9a8b611604da8a728dea5f8cc5fa4464f5974292c3232cb2891a63fc009d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-nvidia-prime"

RDEPENDS:${PN} += "bumblebee-status \
suse-prime-bbswitch"

inherit rpm
