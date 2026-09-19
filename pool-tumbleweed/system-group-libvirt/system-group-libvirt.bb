SUMMARY = "System group libvirt"
DESCRIPTION = "This package provides the system group 'libvirt'."
LICENSE = "MIT"

PV = "20250822"

RPM_NAME = "system-group-libvirt-20250822-2.3.noarch.rpm"
RPM_HASH = "f3fbcdb179c53ff0ff701ccdb6128d5a1d8152291f49303c8c0b6c76de75cd7836a40cbdfc1832553211fafbc788f98731f91967f442398d99a77ce09f551c91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-libvirt \
system-group-libvirt"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
