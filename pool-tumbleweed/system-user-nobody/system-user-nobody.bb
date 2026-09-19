SUMMARY = "System user and group nobody"
DESCRIPTION = "This package provides the system account and group 'nobody'."
LICENSE = "MIT"

PV = "20250822"

RPM_NAME = "system-user-nobody-20250822-2.3.noarch.rpm"
RPM_HASH = "cbf1fbf9c613fca90dd78f5e7bafa21feaca571e3bf8f724579130cdaff40b4f5ba9161a7a04a07538e04d551ab1a34220bee540bf2becab89ef0f53a15b9c51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-nobody \
group-nogroup \
system-user-nobody \
user-nobody"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
