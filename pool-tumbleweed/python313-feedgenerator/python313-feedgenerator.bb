SUMMARY = "Standalone version of django.utilsfeedgenerator, compatible with Py3k"
DESCRIPTION = "FeedGenerator is a standalone version of Django’s feedgenerator module. \
It has evolved over time and includes numerous enhancements."
LICENSE = "BSD-3-Clause"

PV = "2.2.1"

RPM_NAME = "python313-feedgenerator-2.2.1-1.6.noarch.rpm"
RPM_HASH = "7e57b96bf7f8fc84eec649a64702d645cc9944257df6f7c70da045587c7c7b20d035f14cc617fc71d463ae9256f1cf7b392a54d33ec92071161b490c14fac181"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-feedgenerator \
python3.13dist-feedgenerator \
python313-feedgenerator \
python3dist-feedgenerator"

RDEPENDS:${PN} += "python-abi"

inherit rpm
