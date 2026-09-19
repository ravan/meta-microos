SUMMARY = "Asynchronous API wrapper for the Open Build Service"
DESCRIPTION = "``py-obs`` is a simple asynchronous python API wrapper for the `Open Build \
Service <https://openbuildservice.org/>`_."
LICENSE = "GPL-2.0-or-later"

PV = "0.0.2"

RPM_NAME = "python314-py-obs-0.0.2-1.7.noarch.rpm"
RPM_HASH = "f9d2e7aa7a977f10a69d580d53de53316b165374a0c01d029fc5fea234d09ac556377172ae8d6714cca9ef87260f19525f858d8f4e0098d7d9950420c5956519"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-py-obs \
python314-py-obs \
python3dist-py-obs"

RDEPENDS:${PN} += "python-abi"

inherit rpm
