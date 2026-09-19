SUMMARY = "Wubi input schema for rime"
DESCRIPTION = "wubi input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20250315"

RPM_NAME = "rime-schema-wubi-20250315-1.4.noarch.rpm"
RPM_HASH = "602b42625ac9fe781a1efa9f62994d05584d02cad2a2a4c777465542d58426e27f6a05db8aed50e20a202f0aa0b7979808c8e269733301233fda51f7dfdd3c95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-wubi"

RDEPENDS:${PN} += ""

inherit rpm
