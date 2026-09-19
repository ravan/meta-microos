SUMMARY = "System user and group uucp"
DESCRIPTION = "This package provides the system account and group 'uucp' \
and their corresponding directories."
LICENSE = "MIT"

PV = "20250822"

RPM_NAME = "system-user-uucp-20250822-2.3.noarch.rpm"
RPM_HASH = "f585a140a710f284bda317a96d04edd3bb99c46fceed4c070a0c0ab138f71c701e06e6e86c8b8f4453ac540aa99c1ef6f7d74faec437426d67d398d0c7bd4b7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-uucp \
system-user-uucp \
user-uucp"

RDEPENDS:${PN} += "/usr/bin/sh \
group-lock \
sysuser-shadow"

inherit rpm
