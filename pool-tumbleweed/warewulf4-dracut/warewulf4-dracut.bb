SUMMARY = "Dracut module for loading a Warewulf container image"
DESCRIPTION = "This subpackage contains a dracut module that can be used to generate \
an initramfs that can fetch and boot a Warewulf container image from a \
Warewulf server."
LICENSE = "BSD-3-Clause"

PV = "4.7.0"

RPM_NAME = "warewulf4-dracut-4.7.0-4.1.noarch.rpm"
RPM_HASH = "2a75a8e882712af7102095e1be4b6a90c248d25df4ecf5d6a490e141dbe3566661db184c6752247b88bf8240c1aa25ad6aec705ea7eee904662bb5e635366b57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "warewulf4-dracut"

RDEPENDS:${PN} += "dracut"

inherit rpm
