SUMMARY = "The Apache HTTPD Server"
DESCRIPTION = "The Apache HTTP Server Project is an effort to develop and \
maintain an open-source HTTP server for modern operating \
systems including UNIX and Windows. The goal of this project \
is to provide a secure, efficient and extensible server that \
provides HTTP services in sync with the current HTTP standards."
LICENSE = "Apache-2.0"

PV = "2.4.67"

RPM_NAME = "apache2-devel-2.4.67-1.3.aarch64.rpm"
RPM_HASH = "abac04505eaedacb18443eabbe8e0f1f5684d1b3fc4be1f9513da7f9e2cd67294d9cea4d9a87e0ea5b0e1f74c6e4ad89c4cefd7d07671ca9fc49421e4211ab0f"

RPROVIDES:${PN} += "apache2-devel \
httpd-devel"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
apache2 \
apr-devel \
apr-util-devel \
gcc"

inherit rpm
