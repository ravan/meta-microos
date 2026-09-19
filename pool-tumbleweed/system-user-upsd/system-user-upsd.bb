SUMMARY = "System user upsd"
DESCRIPTION = "This package provides the system account 'upsd'."
LICENSE = "MIT"

PV = "20250822"

RPM_NAME = "system-user-upsd-20250822-2.3.noarch.rpm"
RPM_HASH = "3f496f05f4b3c05d0cafbee9139f4e69892c6e3f2a8a655e46a6e37c6dab9b8650916453bbf8809ccf8a9db15f7e3177dd5de29936f4dae9742811fc4c55e6f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-upsd \
system-user-upsd \
user-upsd"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
