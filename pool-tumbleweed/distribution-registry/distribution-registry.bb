SUMMARY = "Registry server following OCI Distribution Specification"
DESCRIPTION = "Registry server for Docker (hosting/delivering of repositories and images)."
LICENSE = "Apache-2.0"

PV = "3.1.1"

RPM_NAME = "distribution-registry-3.1.1-7.1.aarch64.rpm"
RPM_HASH = "d9e9786f8fe085f90b885806d8dffc5066cf143dd20e7699a17a7965e6ff0befb51cb0be4b1acd533f5e72315ae28480b3d20c4ebc3f707555d63317d39dca78"

RPROVIDES:${PN} += "config-distribution-registry \
distribution-registry \
docker-distribution-registry \
group-registry \
user-registry"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/sbin/nologin \
libc.so.6 \
sysuser-shadow"

inherit rpm
