SUMMARY = "Python bindings for libraries for compizconfig-settings"
DESCRIPTION = "Python bindings for libraries/plugins for compizconfig-settings."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "python313-compizconfig-0.8.18-2.34.aarch64.rpm"
RPM_HASH = "168888165163427844cbcb113e27707921f775c7581297735eede7c107a10010d5d16a17a818aa50769844fc844b02efd8d3ad993e11d049378837c3d57b9c08"

RPROVIDES:${PN} += "python3-compizconfig \
python313-compizconfig"

RDEPENDS:${PN} += "compiz \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcompizconfig.so.0 \
python-abi"

inherit rpm
