SUMMARY = "Common utilities to ease the development of Python packages"
DESCRIPTION = "The easydev package  provides miscellaneous functions that are \
repeatedly used during the development of Python packages. The goal \
is to help developers on speeding up their own dev. It has been used \
also as an incubator for other packages and is stable."
LICENSE = "BSD-3-Clause"

PV = "0.14.0"

RPM_NAME = "python313-easydev-0.14.0-1.2.noarch.rpm"
RPM_HASH = "e72b74fca41a29b589b9e444374bcca78c0ea34a721b2c8e6ebd5c5d2c0ad1c891f10a9762e0f7fe8ad08783230886493234b7d269b0e9c7ccb2aff88ccd2126"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-easydev \
python3.13dist-easydev \
python313-easydev \
python3dist-easydev"

RDEPENDS:${PN} += "python-abi \
python313-colorama \
python313-colorlog \
python313-line-profiler \
python313-pexpect \
python313-platformdirs \
update-alternatives"

inherit rpm
