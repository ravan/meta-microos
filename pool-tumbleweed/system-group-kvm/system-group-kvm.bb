SUMMARY = "System group kvm"
DESCRIPTION = "This package provides the system group 'kvm'."
LICENSE = "MIT"

PV = "20250822"

RPM_NAME = "system-group-kvm-20250822-2.3.noarch.rpm"
RPM_HASH = "ed1bc3361c8a8001838a6e5b2528ead964e67e7791aa11db04205de3834f78629c5f924912f54a27e2aefec9456dd620711cfa6dfc22285008822c68eb21ab32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-kvm \
system-group-kvm"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
