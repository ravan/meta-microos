SUMMARY = "Python library for dealing with subprocesses"
DESCRIPTION = "Delegator.py is a library for dealing with subprocesses, inspired \
by both 'envoy' and 'pexpect' (in fact, it depends on it)."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python313-delegator.py-0.1.1-5.5.noarch.rpm"
RPM_HASH = "2d8dafe409a42dc5e69a0329dde5eacec32dcfd9af8289ec713e79046754c3445e90f1ba3ac04c0d56eb25355321fb86c1f79c48868a0f053517b749afcd72b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-delegator.py \
python3.13dist-delegator.py \
python313-delegator.py \
python3dist-delegator.py"

RDEPENDS:${PN} += "python-abi \
python313-pexpect"

inherit rpm
