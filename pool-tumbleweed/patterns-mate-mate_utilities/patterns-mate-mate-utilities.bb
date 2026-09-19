SUMMARY = "MATE Utilities"
DESCRIPTION = "MATE Utilities"
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-mate-mate_utilities-20170319-6.3.aarch64.rpm"
RPM_HASH = "485ec127b3e6a12b1be2cdc86fa0d200706a09cadc9421c618f63977b2da1bd8096634761f580f7835534a7ad560a3cc4dea674c85a0e21ec73e88352c6c1582"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-extends- \
pattern-icon- \
pattern-order- \
patterns-mate-mate-utilities"

RDEPENDS:${PN} += "pattern-"

inherit rpm
