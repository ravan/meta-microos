SUMMARY = "Array input schema for rime"
DESCRIPTION = "array input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20250315"

RPM_NAME = "rime-schema-array-20250315-1.4.noarch.rpm"
RPM_HASH = "86332c0e44c87022deec32a3cb2515487eb4afd929fe93346a8aacd2dedb1ae794dc673bf3a4603302d664d20f9c299c0c7b83428f9dabacaa2a5e10ef0835fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-array"

RDEPENDS:${PN} += ""

inherit rpm
