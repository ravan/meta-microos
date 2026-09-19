SUMMARY = "Essay input schema for rime"
DESCRIPTION = "essay input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20250315"

RPM_NAME = "rime-schema-essay-20250315-1.4.noarch.rpm"
RPM_HASH = "44abd6f9491ae10e693605786845bd237f6cc48d0b8d373aad76748b4cc02a782b4c88c01fceb4a8cc160b890b09eb7002182ad9830890a5a3838d01066ccc9f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-essay"

RDEPENDS:${PN} += ""

inherit rpm
