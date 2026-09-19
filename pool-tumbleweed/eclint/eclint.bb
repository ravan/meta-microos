SUMMARY = "EditorConfig linter"
DESCRIPTION = "eclint - EditorConfig linter \
 \
A faster alternative to the JavaScript eclint written in Go."
LICENSE = "MIT"

PV = "0.5.2"

RPM_NAME = "eclint-0.5.2-1.4.aarch64.rpm"
RPM_HASH = "e5d9610f812ffd78fd56fc5a7edbcfdee0500f47aea7384f6838e1dcfcd98d59476ab0d392069ffee739abe527f4d345719c4907267624352361e02460bdc3ca"

RPROVIDES:${PN} += "eclint"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
