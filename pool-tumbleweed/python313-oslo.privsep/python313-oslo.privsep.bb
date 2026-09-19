SUMMARY = "OpenStack library for privilege separation"
DESCRIPTION = "OpenStack library for privilege separation"
LICENSE = "Apache-2.0"

PV = "3.12.0"

RPM_NAME = "python313-oslo.privsep-3.12.0-1.1.noarch.rpm"
RPM_HASH = "4c356414aeb88d003fab4fd618e0100e7b8927af7b20162aa59e4faee309f81408e8fa7f96455d7e004b1a4ef8fd1d07b97e94f2f0fd2d592d33257affcd00f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.privsep \
python3.13dist-oslo.privsep \
python313-oslo.privsep \
python3dist-oslo.privsep"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-cffi \
python313-eventlet \
python313-greenlet \
python313-msgpack \
python313-oslo.config \
python313-oslo.i18n \
python313-oslo.log \
python313-oslo.utils"

inherit rpm
