SUMMARY = "openSUSE NVIDIA repository definitions"
DESCRIPTION = "Definitions for NVIDIA repository management via zypp-services"
LICENSE = "MIT"

PV = "20260423.1a6a0f3"

RPM_NAME = "openSUSE-repos-Slowroll-NVIDIA-20260423.1a6a0f3-2.2.aarch64.rpm"
RPM_HASH = "98964baaba67d721b4aafe246e02b611ec7994be09ce22cba2fb6729386fa9bce22808e5812bf29cc763068be691417e05d687ba87a7bae83501eb51e294163c"

RPROVIDES:${PN} += "openSUSE-repos-NVIDIA \
openSUSE-repos-Slowroll-NVIDIA"

RDEPENDS:${PN} += "/usr/bin/sh \
openSUSE-repos-Slowroll"

inherit rpm
