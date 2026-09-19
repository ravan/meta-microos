SUMMARY = "System group 'wheel'"
DESCRIPTION = "This package provides the system group 'wheel'."
LICENSE = "MIT"

PV = "20250822"

RPM_NAME = "system-group-wheel-20250822-2.3.noarch.rpm"
RPM_HASH = "c8762ee3227e029f546691f8d87381a3dd2d3f79a56c6daaaedffc33360ca5994fd6aa1ee3d97755de18a8017a1305ff9cd5f3c1d158ffb3ab712623b1b7bdac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-wheel \
system-group-wheel"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
