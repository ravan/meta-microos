SUMMARY = "GPU (nvidia/intel) selection for NVIDIA optimus laptops with bbswitch support"
DESCRIPTION = "A collection of shell scripts that makes it possible to use the \
NVIDIA GPU on a Optimus Laptop. The switching is similar to \
the feature provided by the nvidia-prime package in Ubuntu. \
Uses bbswitch to switch on/of power of NVIDIA GPU."
LICENSE = "0BSD"

PV = "0.8.18"

RPM_NAME = "suse-prime-0.8.18-3.3.noarch.rpm"
RPM_HASH = "6a875d6aa6d4a94b9aa190f670a266875b4eff5006f324bc9702a8518d03ff539e708f6a3340aed304c26bbdf6a261c202a408922c7388383f71eb1f125a5be2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-suse-prime \
suse-prime \
suse-prime-bbswitch"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
coreutils \
pciutils \
sudo"

inherit rpm
