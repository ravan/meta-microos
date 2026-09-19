SUMMARY = "Utility for parsing smbios information and configuring canonical bmc access"
DESCRIPTION = "Scans Smbios information for type 42 management controller information, and uses \
that to configure the appropriate network interface so that the bmc is \
canonically accessible via the hostname redfish-localhost"
LICENSE = "GPL-2.0-only"

PV = "0.4"

RPM_NAME = "redfish-finder-0.4-5.7.noarch.rpm"
RPM_HASH = "71f215e398d5ea9ad7009bb8b5046cb2d0aab9987bdf7257a66991a8fecd67687c70486d67004af119ff913c44d0d2ce92131c4afd0b898b58b99fd492481710"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "redfish-finder"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
NetworkManager \
dmidecode \
python3"

inherit rpm
