SUMMARY = "A port of node.js's EventEmitter to python"
DESCRIPTION = "pyee supplies an ``EventEmitter`` object similar to the ``EventEmitter`` \
from Node.js."
LICENSE = "MIT"

PV = "13.0.1"

RPM_NAME = "python314-pyee-13.0.1-1.4.noarch.rpm"
RPM_HASH = "5151f9d4f071eb895af26e8d708d67febc3e4d944183958b09815e8c97b40af8a2b75d49b4187a4e746b614e4b3050f0dd18eb29d26b685d456a9db07c2ac543"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyee \
python314-pyee \
python3dist-pyee"

RDEPENDS:${PN} += "python-abi \
python314-typing-extensions"

inherit rpm
