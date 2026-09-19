SUMMARY = "A Program for Controlling the Robotic Mechanism in DDS Auto Loaders"
DESCRIPTION = "A program for controlling the robotic mechanism in DDS auto loaders and tape \
libraries."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.12"

RPM_NAME = "mtx-1.3.12-25.5.aarch64.rpm"
RPM_HASH = "2d045b69985f8acb77e8802c61825c9a4d7272dc147d7396a7c225808ce170ff50c7fb0414bb2d235444b9d76d6962d7492e25b138172009f16196b51a684451"

RPROVIDES:${PN} += "mtx"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
