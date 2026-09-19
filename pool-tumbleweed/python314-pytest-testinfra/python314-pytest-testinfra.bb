SUMMARY = "Python module to test infrastructures"
DESCRIPTION = "With Testinfra, one can write unit tests in Python to test the actual \
state of servers configured by managements tools like Salt, Ansible, \
Puppet, Chef and so on. \
 \
Testinfra is like a Serverspec equivalent in Python, and is written \
as a plugin to the Pytest test engine."
LICENSE = "Apache-2.0"

PV = "10.2.2"

RPM_NAME = "python314-pytest-testinfra-10.2.2-1.4.noarch.rpm"
RPM_HASH = "2dad0ef678ab933f676816fa2cdf60f1d2f1423a7131a9c205fb7b5bc643dc23aa0d1acaa2aa4d959af7a0ebb12de3fd9703b15714281afb4c90193b3d6214fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-testinfra \
python314-pytest-testinfra \
python314-testinfra \
python3dist-pytest-testinfra"

RDEPENDS:${PN} += "python-abi \
python314-pytest"

inherit rpm
