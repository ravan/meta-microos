SUMMARY = "Helper for executing preferred application based on user preferences"
DESCRIPTION = "This package contains a default helper and configuration application utility \
for libalternatives. libalternatives is a helper that executes an application \
based on preferences of a user, system admin or package maintainer, in this \
order of preference. This is accomplished with only the help of config files \
and without the need to maintain system symlinks states."
LICENSE = "Apache-2.0"

PV = "2.0+0.4f22c01"

RPM_NAME = "alts-2.0+0.4f22c01-1.1.aarch64.rpm"
RPM_HASH = "876f2a724eef29aefed819e1669e46d0c763d2fcece584e0033f5b89226ffcfd0c3d74a3267433381a42af53bff4e020427ba133d92fa7da00b09458704d60bf"

RPROVIDES:${PN} += "alts"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libalternatives.so.1 \
libc.so.6"

inherit rpm
