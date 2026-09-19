SUMMARY = "YaST2 - Bootloader Configuration"
DESCRIPTION = "This package contains the YaST2 component for bootloader configuration."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.42"

RPM_NAME = "yast2-bootloader-5.0.42-1.1.aarch64.rpm"
RPM_HASH = "fa3e903ca86ff4583296355feaeada4d4e1f1b22d1e7f7aa927c6ed039783d3b78c7ae92e7de2fef68542126afc9d493512f5652b57b71568961e5ee6a6f42d2"

RPROVIDES:${PN} += "yast2-bootloader"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sed \
/usr/bin/sh \
/usr/bin/touch \
augeas-lenses \
fillup \
parted \
rubygem-ruby-4.0.0-cfa-grub2 \
yast2 \
yast2-core \
yast2-packager \
yast2-pkg-bindings \
yast2-ruby-bindings \
yast2-storage-ng"

inherit rpm
