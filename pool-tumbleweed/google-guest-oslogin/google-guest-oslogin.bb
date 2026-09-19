SUMMARY = "Google Cloud Guest OS Login"
DESCRIPTION = "Google Cloud Guest OS Login"
LICENSE = "Apache-2.0"

PV = "20260731.00"

RPM_NAME = "google-guest-oslogin-20260731.00-1.1.aarch64.rpm"
RPM_HASH = "83c23a3cf578e62ca35767639d5d7964c34e8df1be5d96584adea79fca00a380d70118abcbac0d898fdcc38a7ae92fce32447f8d1b673f35f0520e0b2bffde94"

RPROVIDES:${PN} += "google-compute-engine-oslogin \
google-guest-oslogin \
libnss-cache-oslogin.so.2 \
libnss-oslogin.so.2"

RDEPENDS:${PN} += "/usr/bin/sh \
glibc \
google-guest-agent \
google-guest-configs \
libc.so.6 \
libcurl.so.4 \
libgcc-s.so.1 \
libjson-c.so.5 \
libpam.so.0 \
libstdc++.so.6 \
openssh \
pam"

inherit rpm
