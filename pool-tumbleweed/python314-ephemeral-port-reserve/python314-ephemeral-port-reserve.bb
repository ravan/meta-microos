SUMMARY = "Bind to an ephemeral port, force it into the TIME_WAIT state, and unbind it"
DESCRIPTION = "Bind to an ephemeral port, force it into the TIME_WAIT state, and unbind it."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "python314-ephemeral-port-reserve-1.1.4-4.5.noarch.rpm"
RPM_HASH = "7bc80a0998e09ffa5860a8b2f33a7fe1f8f6d630c58d8eef09e853e4705ac0d832460054469cb56a9c090beb724ad7f6a287482c9766388b4d057652e8fc668b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-ephemeral-port-reserve \
python314-ephemeral-port-reserve \
python3dist-ephemeral-port-reserve"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
