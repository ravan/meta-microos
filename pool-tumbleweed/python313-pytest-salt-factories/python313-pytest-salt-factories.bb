SUMMARY = "A pytest plugin for testing Salt"
DESCRIPTION = "A pytest plugin for testing Salt."
LICENSE = "Apache-2.0"

PV = "1.0.5"

RPM_NAME = "python313-pytest-salt-factories-1.0.5-3.2.noarch.rpm"
RPM_HASH = "082c1dc5415cee49ec8ba83cac0992dbfd6ea90c03890e2c9d85701d57e5965125f419a2fe0739af72ba30a086ebc8281c4744c3355d26581ab6b2000be9bb92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-salt-factories \
python3.13dist-pytest-salt-factories \
python313-pytest-salt-factories \
python3dist-pytest-salt-factories"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-PyYAML \
python313-attrs \
python313-msgpack \
python313-psutil \
python313-pytest \
python313-pytest-helpers-namespace \
python313-pytest-shell-utilities \
python313-pytest-skip-markers \
python313-pytest-system-statistics \
python313-pyzmq \
python313-virtualenv"

inherit rpm
