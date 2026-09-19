SUMMARY = "The Standard UNIX FTP Client"
DESCRIPTION = "This package provides the standard UNIX command line FTP client. FTP is \
the file transfer protocol, which is a widely used Internet protocol \
for transferring files."
LICENSE = "BSD-3-Clause"

PV = "0.17"

RPM_NAME = "ftp-0.17-697.5.aarch64.rpm"
RPM_HASH = "a1824c25f64c7b3c660e37eb198c01bf2d8ef4613031b202f64060ff8cd69272b7aa188e60e30edbb0a81336d85642e705690ef9392e4e5fd7f40a5af4b7ad26"

RPROVIDES:${PN} += "ftp"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
