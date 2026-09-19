SUMMARY = "Java daemon launcher"
DESCRIPTION = "Jsvc is a set of libraries and applications for making Java applications run on \
UNIX more easily. It allows the application (e.g. Tomcat) to perform some \
privileged operations as root (e.g. bind to a port < 1024), and then switch \
identity to a non-privileged user."
LICENSE = "Apache-2.0"

PV = "1.6.1"

RPM_NAME = "apache-commons-daemon-jsvc-1.6.1-1.3.aarch64.rpm"
RPM_HASH = "e807fae028ed55f426230b7a719d1cc6c6892ca8581a92d30eca52f8e0306f18a97fcce8ab9616aa54ac17191ad4378a5db014f7fed5f77b75a449ec61263855"

RPROVIDES:${PN} += "apache-commons-daemon-jsvc \
jakarta-commons-daemon-/usr/sbin/jsvc \
jsvc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
