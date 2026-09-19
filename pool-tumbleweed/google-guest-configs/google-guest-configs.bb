SUMMARY = "Google Cloud Guest Configs"
DESCRIPTION = "Google Cloud Guest Configs"
LICENSE = "Apache-2.0"

PV = "20260729.00"

RPM_NAME = "google-guest-configs-20260729.00-1.1.noarch.rpm"
RPM_HASH = "827cb6f2aca89b6ad9cb694ecce94c48971fafd941b472581bf1d0c6d7fcf87bfc5c83ff610c99ece2107f7d87db8e4648ec8bfb9a2a713287b922626bd95c14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-google-guest-configs \
google-guest-configs"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
nvme-cli"

inherit rpm
