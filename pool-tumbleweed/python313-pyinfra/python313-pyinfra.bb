SUMMARY = "Infrastructure automation, provisioning and deployment"
DESCRIPTION = "Pyinfra turns Python code into shell commands and runs them on your servers. \
Execute ad-hoc commands and write declarative operations. \
Target SSH servers, local machine and Docker containers. \
Fast and scales from one server to thousands. \
Think ansible but Python instead of YAML, and a lot faster."
LICENSE = "MIT"

PV = "3.7"

RPM_NAME = "python313-pyinfra-3.7-1.3.noarch.rpm"
RPM_HASH = "fe8419e8e1105daeffb1dc772b430183635a19c4547875f14f13eb9aae52ad7fe2fdb94693e2b702b5c30529a5619b0b02874fea776c2da18e6e61b37caf6406"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pyinfra \
python3-pyinfra \
python3.13dist-pyinfra \
python313-pyinfra \
python3dist-pyinfra"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python3 \
python313-click \
python313-distro \
python313-gevent \
python313-jinja2 \
python313-packaging \
python313-paramiko \
python313-pydantic \
python313-python-dateutil \
python313-typeguard"

inherit rpm
