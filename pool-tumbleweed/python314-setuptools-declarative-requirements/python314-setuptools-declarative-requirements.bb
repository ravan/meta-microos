SUMMARY = "File support for setuptools declarative setup.cfg"
DESCRIPTION = "File support for setuptools declarative setup.cfg."
LICENSE = "Apache-2.0"

PV = "1.3.0"

RPM_NAME = "python314-setuptools-declarative-requirements-1.3.0-2.10.noarch.rpm"
RPM_HASH = "aff5ef294ed5a2633631feccda0509db65887fe3197f0e420e9374186648b69db59504eba45b353fcd6d372a0d778bac61e7871c69f2519a5325599bb282689f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-setuptools-declarative-requirements \
python314-setuptools-declarative-requirements \
python3dist-setuptools-declarative-requirements"

RDEPENDS:${PN} += "python-abi \
python314-setuptools \
python314-toml \
python314-wheel"

inherit rpm
