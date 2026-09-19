SUMMARY = "Python library that converts cron expressions into human readable strings"
DESCRIPTION = "A Python library that converts cron expressions into human readable strings."
LICENSE = "MIT"

PV = "1.4.5"

RPM_NAME = "python314-cron-descriptor-1.4.5-2.5.noarch.rpm"
RPM_HASH = "a85d3e705dfc66a972bf7098341a0c82cb3cf58f2895a9dbea91952773e59d11bca7de9ddbd5c408b20b6be3bbb58c024b250e88f7045f1f31abed60be4454e8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-cron-descriptor \
python314-cron-descriptor \
python3dist-cron-descriptor"

RDEPENDS:${PN} += "python-abi"

inherit rpm
