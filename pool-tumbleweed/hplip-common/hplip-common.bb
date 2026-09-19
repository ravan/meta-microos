SUMMARY = "HPLIP common files"
DESCRIPTION = "This package contains common files needed by other hplip packages."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & MIT"

PV = "3.26.4"

RPM_NAME = "hplip-common-3.26.4-2.2.noarch.rpm"
RPM_HASH = "94699ba11a3735baf3c1a58b4f40ee762b41305fb2e4a0de06c2a06685772531bce22453c96bb083b79ff8582e21cbb7cba9a79acb45ad269e3a45b5dc737f5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-hplip-common \
hplip-common \
hplip-udev-rules"

RDEPENDS:${PN} += "/usr/bin/sh \
group-lp"

inherit rpm
