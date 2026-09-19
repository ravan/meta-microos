SUMMARY = "System user vscan"
DESCRIPTION = "This package provides the system user 'vscan'."
LICENSE = "MIT"

PV = "20250822"

RPM_NAME = "system-user-vscan-20250822-2.3.noarch.rpm"
RPM_HASH = "59635c39d50bbd76951afc2b5833c0b24e30d331da8b943990a4a7afad70066e2777b465b5203555a18098eae928f6eb4f469a3d3a1d9f0cb576bcf4e1a76e93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "group-vscan \
system-user-vscan \
user-vscan"

RDEPENDS:${PN} += "/usr/bin/sh \
sysuser-shadow"

inherit rpm
