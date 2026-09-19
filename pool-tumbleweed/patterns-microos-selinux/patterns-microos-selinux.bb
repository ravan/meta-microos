SUMMARY = "SELinux Support"
DESCRIPTION = "This are packages which are required to enable SELinux on openSUSE MicroOS"
LICENSE = "MIT"

PV = "5.0"

RPM_NAME = "patterns-microos-selinux-5.0-111.1.aarch64.rpm"
RPM_HASH = "b46a2ed18dd648674664f4fd85bbf69030973439cf9b9ba0ac622250a61d44058006789001a90e1fcf8a5e585dfa9a9b420c9fb9204c5661e8befe3e332f54b2"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-microos-selinux"

RDEPENDS:${PN} += "container-selinux \
policycoreutils \
selinux-policy-targeted \
selinux-tools"

inherit rpm
