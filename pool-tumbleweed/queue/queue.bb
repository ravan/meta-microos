SUMMARY = "Tool for queuing shell commands"
DESCRIPTION = "This tool allows to queue shell commands. \
It supports multiple queues as well as multiple queue workers."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.0"

RPM_NAME = "queue-1.3.0-1.4.noarch.rpm"
RPM_HASH = "5456563e91c143dbcfd79b445739cb90fad90a46be6688de3a1ef4179369c064a68eb4fc03e2f94e5dfad9ad4a28e85f8f6ad4205420b5d8c078a494f40132c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-cmdqueue \
python3dist-cmdqueue \
queue"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-psutil \
python3-termcolor \
python3-tomlkit"

inherit rpm
