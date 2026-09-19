SUMMARY = "Hangul Text to Postscript Converter"
DESCRIPTION = "Convert plain hangul text into postscript form. By Choi Jun Ho, the \
Junker <junker@jazz.snu.ac.kr>. \
 \
 \
 \
Authors: \
-------- \
    Choi Jun Ho <junker@jazz.snu.ac.kr>"
LICENSE = "SUSE-Public-Domain"

PV = "2.3.1"

RPM_NAME = "nh2ps-2.3.1-678.9.aarch64.rpm"
RPM_HASH = "bcd3d824d6de4ff58edb18a6547987ddefe4ec81743ac7784993a88443530cb9f89af1017c4a8d09c72e976bee90d4d180939cd154e390878da91befae5b6c3a"

RPROVIDES:${PN} += "nh2ps"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
