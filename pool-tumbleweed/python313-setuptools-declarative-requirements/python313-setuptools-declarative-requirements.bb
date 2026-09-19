SUMMARY = "File support for setuptools declarative setup.cfg"
DESCRIPTION = "File support for setuptools declarative setup.cfg."
LICENSE = "Apache-2.0"

PV = "1.3.0"

RPM_NAME = "python313-setuptools-declarative-requirements-1.3.0-2.10.noarch.rpm"
RPM_HASH = "acedf7c19951f939da33b3251552f6c04c77e8f7dcc95e5a12fa851275de16ebf009175f686135422ec4c81728bc236822753bf8d5187fd1f6a03d6a98fbf9ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-setuptools-declarative-requirements \
python3.13dist-setuptools-declarative-requirements \
python313-setuptools-declarative-requirements \
python3dist-setuptools-declarative-requirements"

RDEPENDS:${PN} += "python-abi \
python313-setuptools \
python313-toml \
python313-wheel"

inherit rpm
