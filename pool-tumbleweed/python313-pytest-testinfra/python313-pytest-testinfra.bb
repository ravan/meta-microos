SUMMARY = "Python module to test infrastructures"
DESCRIPTION = "With Testinfra, one can write unit tests in Python to test the actual \
state of servers configured by managements tools like Salt, Ansible, \
Puppet, Chef and so on. \
 \
Testinfra is like a Serverspec equivalent in Python, and is written \
as a plugin to the Pytest test engine."
LICENSE = "Apache-2.0"

PV = "10.2.2"

RPM_NAME = "python313-pytest-testinfra-10.2.2-1.4.noarch.rpm"
RPM_HASH = "31b2edf51fee15657653aed71f9d9bc01852705fcebe24ccbe4c6ad2a266909c7ad6a22bc3acb81a586bd670b6c814ca1e188e39dd991131fd24ba5b90264a59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-testinfra \
python3-testinfra \
python3.13dist-pytest-testinfra \
python313-pytest-testinfra \
python313-testinfra \
python3dist-pytest-testinfra"

RDEPENDS:${PN} += "python-abi \
python313-pytest"

inherit rpm
