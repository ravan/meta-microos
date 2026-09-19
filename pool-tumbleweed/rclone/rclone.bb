SUMMARY = "Rsync for cloud storage"
DESCRIPTION = "rsync for cloud storage. rclone is a command line program to sync files and \
directories to and from a wide variety of cloud storage providers, providing \
various additional features."
LICENSE = "MIT"

PV = "1.75.1"

RPM_NAME = "rclone-1.75.1-2.1.aarch64.rpm"
RPM_HASH = "13385237d8f16e38f15d5cf17fc7ed563ba96bf64d5fc5ff381861efca2f83f8d9c72ba8ca7f495b4e17aebf855fbc518ecb2e9598dbc9b3104cfc59aecd3fc1"

RPROVIDES:${PN} += "rclone"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
