SUMMARY = "System user lp"
DESCRIPTION = "This package provides the system account and group 'lp'."
LICENSE = "MIT"

PV = "20250822"

RPM_NAME = "system-user-lp-20250822-2.3.noarch.rpm"
RPM_HASH = "671108866a5ef0609f36f9e4efd0f1564fb65bdccf762e9ac498e3829e053e86b60ec12c31a126dc85151a3cc1d02ca182680eb13ed3dce28ae545f24535e8d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-lp \
system-user-lp \
user-lp"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
