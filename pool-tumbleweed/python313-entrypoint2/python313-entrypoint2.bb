SUMMARY = "Command-line interface for python modules"
DESCRIPTION = "entrypoint2 is a command-line interface for python modules, forked \
off entrypoint."
LICENSE = "BSD-2-Clause"

PV = "1.1"

RPM_NAME = "python313-entrypoint2-1.1-3.5.noarch.rpm"
RPM_HASH = "11562efd1408ed509f1d8e809dc61315f2034e4157ab6df47c52be9de310a805c320cab02db7e0dc1c8529bf1e8294de3a67f1fa8468d9e869cd473b41b30c92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-entrypoint2 \
python3.13dist-entrypoint2 \
python313-entrypoint2 \
python3dist-entrypoint2"

RDEPENDS:${PN} += "python-abi \
python313-EasyProcess \
python313-decorator \
python313-path.py"

inherit rpm
