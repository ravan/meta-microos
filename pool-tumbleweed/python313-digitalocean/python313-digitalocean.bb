SUMMARY = "Python module for Digital Ocean droplets"
DESCRIPTION = "Python module to manage Digital Ocean droplets."
LICENSE = "LGPL-3.0-only"

PV = "1.17.0"

RPM_NAME = "python313-digitalocean-1.17.0-4.1.noarch.rpm"
RPM_HASH = "cfb9435f2ae7a6bff829ee84e38ffdef8ec3c9d70570cc65491370c6690cec5d4f05edb500a35435ac0640aec53297482ea3a3177b0f330d1667d58f89bb3f89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-digitalocean \
python3.13dist-python-digitalocean \
python313-digitalocean \
python3dist-python-digitalocean"

RDEPENDS:${PN} += "python-abi \
python313-jsonpickle \
python313-requests"

inherit rpm
