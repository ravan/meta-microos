SUMMARY = "An OBS source service: Refreshs local patches"
DESCRIPTION = "This is a source service for openSUSE Build Service. \
 \
It refreshes locals patches by using quilt."
LICENSE = "Apache-2.0"

PV = "0.3.9+git.1625238904.d59f20e"

RPM_NAME = "obs-service-refresh_patches-0.3.9+git.1625238904.d59f20e-2.14.noarch.rpm"
RPM_HASH = "bf26ac16299fa994bcccea56bbf7e06c5621e30a4d01236411be9cb311622513ec816e45bd22cd1474b64b66997603b530cbf8e5890407d9ff47532dc25ebb1a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-refresh-patches"

RDEPENDS:${PN} += "/usr/bin/python3 \
python3 \
quilt"

inherit rpm
