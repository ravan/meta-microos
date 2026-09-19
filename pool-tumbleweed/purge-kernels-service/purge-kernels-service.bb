SUMMARY = "The service for removing old kernels when multiversion is enabled"
DESCRIPTION = "This service runs zypper purge-kernels on boot after a kernel package was installed."
LICENSE = "MIT"

PV = "0"

RPM_NAME = "purge-kernels-service-0-9.14.noarch.rpm"
RPM_HASH = "02a3b009f2cef966010802e0f409c88d4628c2b1c628c8cd69e73660fadc1ec4fc991a73647a3436a5fc22bfaaf5f75b21a803b08f0244fb21bb96771f633378"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dracut-/usr/lib/systemd/system/purge-kernels.service \
purge-kernels-service"

RDEPENDS:${PN} += "/usr/bin/sh \
zypper-purge-kernels"

inherit rpm
