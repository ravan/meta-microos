SUMMARY = "Tool to reencrypt kiwi raw images"
DESCRIPTION = "Convert a plain text kiwi image into one with LUKS full disk \
encryption. Supports both raw and qcow2 images. It assumes that the \
third partition is the root fs using btrfs. \
After encrypting the disk, the fs is mounted and a new initrd \
created as well as the grub2 config adjusted."
LICENSE = "MIT"

PV = "1+git20260827.0550628"

RPM_NAME = "disk-encryption-tool-1+git20260827.0550628-1.1.noarch.rpm"
RPM_HASH = "f1e5aacbc534e7d6a81d0dd9c37e72c7935702291315187f364ce8c59c5db836c3f3db26e8a815a6048960755fe3af4eab268cb01498cee6f0dd0706de51f275"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "disk-encryption-tool"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
combustion \
cryptsetup \
keyutils"

inherit rpm
