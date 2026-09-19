SUMMARY = "Time Zone Descriptions"
DESCRIPTION = "These are configuration files that describe available time zones. You \
can select an appropriate time zone for your system with YaST."
LICENSE = "BSD-3-Clause & LicenseRef-SUSE-Public-Domain"

PV = "2026c"

RPM_NAME = "timezone-2026c-2.1.aarch64.rpm"
RPM_HASH = "3647b404cd870ff7acdd0bae09cd43f3da0fc0bcb0b05f183be73968026f4784d7893c6d1372fdd8c5eb9caa3eb316484ead4b5aa4600c68412f3fa5ac83d220"

RPROVIDES:${PN} += "config-timezone \
timezone"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
