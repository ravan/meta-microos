SUMMARY = "Additional Backends for CUPS"
DESCRIPTION = "This package contains free additional backends for CUPS."
LICENSE = "GPL-2.0"

PV = "1.1"

RPM_NAME = "cups-backends-1.1-5.22.noarch.rpm"
RPM_HASH = "ce3693ea26f2d19164ebed73efecae281b28f2c3458be5f0a1f1d6a85c049d0304a46455fece46bcc7a9b123e500a4ae668ac7a22bfe899a95912899214ef817"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cups-backends"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
cups"

inherit rpm
