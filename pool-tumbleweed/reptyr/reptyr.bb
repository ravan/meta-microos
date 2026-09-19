SUMMARY = "A tool for 're-ptying' programs"
DESCRIPTION = "reptyr is a utility for taking an existing running program and \
attaching it to a new terminal. Started a long-running process over \
ssh, but have to leave and don't want to interrupt it? Just start a \
screen, use reptyr to grab it, and then kill the ssh session and head \
on home."
LICENSE = "MIT"

PV = "0.10.0"

RPM_NAME = "reptyr-0.10.0-1.5.aarch64.rpm"
RPM_HASH = "bcb2f31e01666c279e64d2e5550eedd46b416a462144f3573d439789359ef56464d85c6f1f872e44af0e3c698db9d01882cc2f6f6d9599255dac1407dfdc21bf"

RPROVIDES:${PN} += "reptyr"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
