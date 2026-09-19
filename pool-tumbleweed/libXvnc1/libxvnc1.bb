SUMMARY = "X extension to control VNC module"
DESCRIPTION = "Xvnc extension allows X clients to read and change VNC configuration."
LICENSE = "GPL-2.0-only & MIT"

PV = "1.16.1"

RPM_NAME = "libXvnc1-1.16.1-3.1.aarch64.rpm"
RPM_HASH = "ae472b80ef85fe0c41ea58ba482168ca2b89fd55254710e9dc246e0a0c1dd05f2c3bd4314cc64f19af11ee389002f7323d08a6b9a815d111399da71868b2209f"

RPROVIDES:${PN} += "libXvnc.so.1 \
libXvnc1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
