SUMMARY = "GPU selection for NVIDIA optimus using optimus-manager"
DESCRIPTION = "GPU (nvidia/intel) selection for NVIDIA optimus laptops using optimus-manager."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-nvidia-optimus-manager-2.1.5-4.7.noarch.rpm"
RPM_HASH = "8609a9064ad86af93cf523916d3a7a9efa58dc266a753c817ca42e4c3e582789e7602a3ea4e0f6c7646ff0dfbfab7c286532a9a2475d3ee37872ec2c96154075"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-nvidia-optimus-manager"

RDEPENDS:${PN} += "bumblebee-status"

inherit rpm
