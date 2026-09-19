SUMMARY = "openSUSE NVIDIA repository definitions"
DESCRIPTION = "Definitions for NVIDIA repository management via zypp-services"
LICENSE = "MIT"

PV = "20260423.1a6a0f3"

RPM_NAME = "openSUSE-repos-MicroOS-NVIDIA-20260423.1a6a0f3-2.2.aarch64.rpm"
RPM_HASH = "419bdccc0a1fd97bbbbf38e1fabe823fc6e39e82d4bb279971665cc82e5d06063c8dea32ecb0cd76c307286869a463f679c965818bc8f83fe21af0640df1e5b0"

RPROVIDES:${PN} += "openSUSE-repos-MicroOS-NVIDIA \
openSUSE-repos-NVIDIA"

RDEPENDS:${PN} += "/usr/bin/sh \
openSUSE-repos-MicroOS"

inherit rpm
