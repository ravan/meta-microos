SUMMARY = "Shows yubikey information"
DESCRIPTION = "The output indicates that a YubiKey is not connected or it displays \
the corresponding serial number."
LICENSE = "MIT"

PV = "2.1.5"

RPM_NAME = "bumblebee-status-module-yubikey-2.1.5-4.7.noarch.rpm"
RPM_HASH = "63316ce54dc130ae99449408d54678126e8a0f6d88736f287cc36497a48e0fe9120573b75861d176f967673a0ec538c2b9651466b11dd1828bf6da4fec237211"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bumblebee-status-module-yubikey"

RDEPENDS:${PN} += "bumblebee-status \
python3-python-yubico"

inherit rpm
