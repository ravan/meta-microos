SUMMARY = "System user and group 'man'"
DESCRIPTION = "This package provides the system account and group 'man' \
and their corresponding directories."
LICENSE = "MIT"

PV = "20250822"

RPM_NAME = "system-user-man-20250822-2.3.noarch.rpm"
RPM_HASH = "262eeefee912d06d5e3250cdf4357a47a5292a14b9f1e1ccc48ca9d71c75d5d9377ff3076b96cf55e82acd2c7d085bce0259088eb05504ede8251bd7ef679758"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-man \
system-user-man \
user-man"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
