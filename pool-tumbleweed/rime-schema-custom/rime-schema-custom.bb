SUMMARY = "Basic schema to customize rime"
DESCRIPTION = "basic schema to customize rime."
LICENSE = "GPL-3.0-or-later"

PV = "20250315"

RPM_NAME = "rime-schema-custom-20250315-1.4.noarch.rpm"
RPM_HASH = "40e45140aa0e22d3c90cf1a8bcf51a31c92295308ad8908ce0a0ea89d0ffe4dd43619e8e9c1f936ca6265e82ce33efb5a4bc2f7ef4019c4729c935899119d1ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-custom"

RDEPENDS:${PN} += ""

inherit rpm
