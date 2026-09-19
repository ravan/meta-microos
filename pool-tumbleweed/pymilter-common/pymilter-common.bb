SUMMARY = "Common files for pymilter"
DESCRIPTION = "This package contains the common files used for pymilter."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.6"

RPM_NAME = "pymilter-common-1.0.6-1.2.noarch.rpm"
RPM_HASH = "67f6646363f7fdc2672bb5c3203da9a08a1fef3badeecb2f30f0360811067b5c7dacb66ac716768897c99638b6a6ed9a69df122b53b5804dd9f9bbfcc814ff6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pymilter-common"

RDEPENDS:${PN} += "/usr/bin/sh \
group-mail \
systemd \
user-mail"

inherit rpm
