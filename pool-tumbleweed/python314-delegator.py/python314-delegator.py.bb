SUMMARY = "Python library for dealing with subprocesses"
DESCRIPTION = "Delegator.py is a library for dealing with subprocesses, inspired \
by both 'envoy' and 'pexpect' (in fact, it depends on it)."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python314-delegator.py-0.1.1-5.5.noarch.rpm"
RPM_HASH = "e06f25d487b28d38eb95df552871c92d41809a056ddb88093897ad97faca737ac8c7aff1d16160edaa193ac90a1afe932014e626c9872f631d584353f841423f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-delegator.py \
python314-delegator.py \
python3dist-delegator.py"

RDEPENDS:${PN} += "python-abi \
python314-pexpect"

inherit rpm
