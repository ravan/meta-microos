SUMMARY = "Terminal JSON viewer"
DESCRIPTION = "Terminal JSON viewer."
LICENSE = "MIT"

PV = "39.2.0"

RPM_NAME = "fx-39.2.0-1.7.aarch64.rpm"
RPM_HASH = "4a189afd1eb3b30a8661ad573240e087c1fb6288487d836a59f8bd422ec775a1abca00e7bde262affd8a6d1fa8c43a36f1d3e95c7a88f1df002fbbac9a15ffc3"

RPROVIDES:${PN} += "fx"

RDEPENDS:${PN} += ""

inherit rpm
