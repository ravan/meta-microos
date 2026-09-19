SUMMARY = "NetworkManager compatibility for connman"
DESCRIPTION = "Provides NetworkManager compatibility for Connman (Connection Manager)."
LICENSE = "GPL-2.0-only"

PV = "1.42"

RPM_NAME = "connman-nmcompat-1.42-2.16.aarch64.rpm"
RPM_HASH = "4a63a721bc45cca3b8e26e9193714e5a714353edbe13b6fb7bdab0c07e17f284c7c11ad4def9ba6a2375343719f41d5b37e45c9dc098967163aa780ba7f48d5d"

RPROVIDES:${PN} += "connman-nmcompat"

RDEPENDS:${PN} += "connman"

inherit rpm
