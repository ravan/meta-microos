SUMMARY = "XTRX's fork from myriadrf/LMS7002M-driver"
DESCRIPTION = "XTRX's fork from myriadrf/LMS7002M-driver."
LICENSE = "Apache-2.0"

PV = "0.0.0+git.20171206"

RPM_NAME = "libxtrx_lms7002m0_0_0-SUSE-0.0.0+git.20171206-3.5.aarch64.rpm"
RPM_HASH = "c2b1798ba602da9d788fb27a8234f262b68e3c3cd313ac41f200998ce9099462190824beaa123d45885ae9f65db1c0d4cc84a4f10c62aeed3427444e0fa09160"

RPROVIDES:${PN} += "libxtrx-lms7002m.so.0.0.0-SUSE \
libxtrx-lms7002m0-0-0-SUSE"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
