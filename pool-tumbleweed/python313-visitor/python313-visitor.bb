SUMMARY = "A tiny pythonic visitor implementation"
DESCRIPTION = "A tiny library to facilitate visitor implementation in Python \
(which are slightly peculiar due to dynamic typing)."
LICENSE = "MIT"

PV = "0.1.3"

RPM_NAME = "python313-visitor-0.1.3-2.5.noarch.rpm"
RPM_HASH = "b9cdcb15b1a08c057e22d6e37c9c09d08d4c179c80f99ebe5fddeceb51ccc51fcfc88e67bc9dc0cf379d7520737a9e24bf3a4f9ee00815860abc47d7533c7ba0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-visitor \
python3.13dist-visitor \
python313-visitor \
python3dist-visitor"

RDEPENDS:${PN} += "python-abi"

inherit rpm
