SUMMARY = "Udev rules to access Pulsar devices from normal user accounts"
DESCRIPTION = "udev rules to use pulsar tools from normal users."
LICENSE = "MIT"

PV = "0.0.3+git0.416f082"

RPM_NAME = "pulsar-udev-rules-0.0.3+git0.416f082-1.2.noarch.rpm"
RPM_HASH = "a9946c60073beb3f6779ba48197839ae00cc59e85f916c7e0474c525d010b2c6d4da90495184da685bb63da6cdeeb320ba93a4be1a488426920a7eb558d0b7f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pulsar-udev-rules"

RDEPENDS:${PN} += ""

inherit rpm
