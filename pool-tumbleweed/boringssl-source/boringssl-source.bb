SUMMARY = "Source code of BoringSSL"
DESCRIPTION = "Source files for BoringSSL implementation"
LICENSE = "OpenSSL"

PV = "0.20260813"

RPM_NAME = "boringssl-source-0.20260813-2.1.noarch.rpm"
RPM_HASH = "257829be7e9022c1f7b658663e99cd4870e7bf9c433e102dd7e81407321a5f4fcad0c3e57b340b3c33748aa37c7e9630c45da1f1aa32911f0d23efb5d52c1575"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boringssl-source \
perl-PQCodePackage"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/perl \
/usr/bin/python3 \
/usr/bin/sh"

inherit rpm
