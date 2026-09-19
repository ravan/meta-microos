SUMMARY = "Infrastructure automation, provisioning and deployment"
DESCRIPTION = "Pyinfra turns Python code into shell commands and runs them on your servers. \
Execute ad-hoc commands and write declarative operations. \
Target SSH servers, local machine and Docker containers. \
Fast and scales from one server to thousands. \
Think ansible but Python instead of YAML, and a lot faster."
LICENSE = "MIT"

PV = "3.7"

RPM_NAME = "python314-pyinfra-3.7-1.3.noarch.rpm"
RPM_HASH = "d92221124aac42c4561f699243c893eb639957e51fcd5abe5589aed350a9d7644f1f01125389117dd1c9eb37b04a42eae3e51a474f88a518aee0f51498f7db58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyinfra \
python314-pyinfra \
python3dist-pyinfra"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python3 \
python314-click \
python314-distro \
python314-gevent \
python314-jinja2 \
python314-packaging \
python314-paramiko \
python314-pydantic \
python314-python-dateutil \
python314-typeguard"

inherit rpm
