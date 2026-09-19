SUMMARY = "Remote Desktop Server"
DESCRIPTION = "This package contains a server-side implementation which can export a desktop \
via the Remote Desktop Protocol (RDP) following the Microsoft Open \
Specifications."
LICENSE = "Apache-2.0"

PV = "2.11.7"

RPM_NAME = "freerdp2-server-2.11.7-8.4.aarch64.rpm"
RPM_HASH = "4ec0f86467149dfcb9756ca830ca50d9d602babc607cc7e880e0eb306cd48df3a3726152d95ccbeca3747ba2f58f6f8aa4c02a3200fb86fef312ee89a2670a53"

RPROVIDES:${PN} += "freerdp2-server"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libfreerdp-shadow-subsystem2.so.2 \
libfreerdp-shadow2.so.2 \
libwinpr-tools2.so.2 \
libwinpr2.so.2"

inherit rpm
