SUMMARY = "Binary for incus, usable to connect to remote instances"
DESCRIPTION = "This package only installs the incus binary to be able to connect to remote \
Incus instances."
LICENSE = "Apache-2.0"

PV = "7.4"

RPM_NAME = "incus-cli-7.4-1.1.aarch64.rpm"
RPM_HASH = "61121b867dd5cd4e141eb925637d0a3d09127deca47b49e6fc01e4e79e9b0affc99479ce0ab68f061163005d7c13535c6ba373ee45a20fd59a350d58e2545f50"

RPROVIDES:${PN} += "incus-cli"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
