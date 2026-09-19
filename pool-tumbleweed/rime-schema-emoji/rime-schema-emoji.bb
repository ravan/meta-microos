SUMMARY = "Emoji input schema for rime"
DESCRIPTION = "emoji input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20250315"

RPM_NAME = "rime-schema-emoji-20250315-1.4.noarch.rpm"
RPM_HASH = "d477ff2892ae48adef435d76d838673fffe776275aeaa0612ec3d90dbac3b8e3d876a27c71ac10147d2c8e7502c2dd5cc9edeecb719e897a4f44ba6833b85165"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-emoji"

RDEPENDS:${PN} += ""

inherit rpm
