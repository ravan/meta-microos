SUMMARY = "Ruby bindings for the SELinux runtime library"
DESCRIPTION = "libselinux provides an interface to get and set process and file \
security contexts and to obtain security policy decisions. \
 \
This subpackage contains Ruby extensions to use SELinux from that \
language."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "3.11"

RPM_NAME = "ruby-selinux-3.11-2.1.aarch64.rpm"
RPM_HASH = "c7342e28abfeca0b0a1258d740ef7fcc4c2afd3b32f73ebf004be63a6d7c8bef204e3e1595cf2c8b4780ae5e1935da616941323a070cebf68c37e59b8b77d7a3"

RPROVIDES:${PN} += "ruby-selinux"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libruby4.0.so.4.0 \
libselinux.so.1 \
libselinux1 \
ruby"

inherit rpm
