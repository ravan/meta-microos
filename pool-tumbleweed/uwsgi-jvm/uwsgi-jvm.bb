SUMMARY = "JVM Plugin for uWSGI"
DESCRIPTION = "uWSGI is a self-healing application container server coded in pure C. \
 \
This package contains support for embedding a Java virtual machine in uWSGI."
LICENSE = "Apache-2.0 & GPL-2.0-only-with-GCC-exception-2.0"

PV = "2.0.31"

RPM_NAME = "uwsgi-jvm-2.0.31-4.4.aarch64.rpm"
RPM_HASH = "30454f91298405fad6e7505d7e0b089a0bda8383833b54b8706e44e85082a2cf6d49adaf126eaa13e133188d29a5c2a2bbe2832869885f87b8e4fe6f225d383a"

RPROVIDES:${PN} += "uwsgi-jvm \
uwsgi-jwsgi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libjvm.so \
uwsgi"

inherit rpm
