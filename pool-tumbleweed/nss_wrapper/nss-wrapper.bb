SUMMARY = "A wrapper for the user, group and hosts NSS API"
DESCRIPTION = "There are projects which provide daemons that need to be able to create, modify \
and delete Unix users, or just switch user IDs to interact with the system, e.g. \
a user space file server. To be able to test that, you need the privilege to \
modify the passwd and groups files. With nss_wrapper, it is possible to define \
your own passwd and groups files which will be used by software to act correctly \
while under test. \
 \
If you have a client and server under test, they normally use functions to \
resolve network names to addresses (DNS) or vice versa. The nss_wrappers allow \
you to create a hosts file to setup name resolution for the addresses you use \
with socket_wrapper. \
 \
To use it, set the following environment variables: \
 \
LD_PRELOAD=libuid_wrapper.so \
NSS_WRAPPER_PASSWD=/path/to/passwd \
NSS_WRAPPER_GROUP=/path/to/group \
NSS_WRAPPER_HOSTS=/path/to/host \
 \
This package does not have a devel package, because this project is for \
development/testing."
LICENSE = "BSD-3-Clause"

PV = "1.1.16"

RPM_NAME = "nss_wrapper-1.1.16-2.5.aarch64.rpm"
RPM_HASH = "41b65d45de6bf04ceb9b06dc8f217c57d15adfa4f5b51d6ac66b7c2d8ddbc3f97f93e88d53609df4697a5ebc80a5433c260c211f4cb381495e19a76e81206d6b"

RPROVIDES:${PN} += "cmake-nss-wrapper \
libnss-wrapper.so.0 \
nss-wrapper \
pkgconfig-nss-wrapper"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/perl \
/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
