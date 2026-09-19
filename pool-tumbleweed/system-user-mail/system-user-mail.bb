SUMMARY = "System user and group mail"
DESCRIPTION = "This package provides the system account and group 'mail'."
LICENSE = "MIT"

PV = "20250822"

RPM_NAME = "system-user-mail-20250822-2.3.noarch.rpm"
RPM_HASH = "97c3b820c694aea9d8653dc7d60fe2e77f6612dd3f48a2e3f06551b445c300ba0926f518575f1621f20e1d2a1f7039c5fe3f627081d9eacb8299613fec3da0f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-mail \
system-user-mail \
user-mail"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
