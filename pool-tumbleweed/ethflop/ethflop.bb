SUMMARY = "A network-backed floppy emulator for DOS"
DESCRIPTION = "ethflop is a network-backed floppy emulator for DOS, mapping a DOS \
floppy drive to a remote disk image. This package contains the server \
and the DOS TSR. \
 \
Features \
 - emulates many types of virt. floppies (from 360K up to 31M) \
 - requires only a working packet driver for connectivity \
 - presents a block device to DOS, almost undistinguishable from a real FDD \
 - fits in 2K of memory (and can be loaded high)"
LICENSE = "ISC"

PV = "0~20191003"

RPM_NAME = "ethflop-0~20191003-1.11.aarch64.rpm"
RPM_HASH = "3e675ec7d72dc4c37ce1e036ebe4cf33c877dee0c6003d9406aa5a3b65e54e7db5869367367821d68ceab0c3d00cfab31090451bbcbcfe060cecb9855282d900"

RPROVIDES:${PN} += "ethflop \
ethflopd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
