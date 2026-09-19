SUMMARY = "Python library that converts cron expressions into human readable strings"
DESCRIPTION = "A Python library that converts cron expressions into human readable strings."
LICENSE = "MIT"

PV = "1.4.5"

RPM_NAME = "python313-cron-descriptor-1.4.5-2.5.noarch.rpm"
RPM_HASH = "31372daa021222d94a881dda2800f87c4856755ecfe16c36517c621c4f35676cde9a4e2c89449022100c126cf1f198dbe9e15c2433910bc52311f55ca73b399a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cron-descriptor \
python3.13dist-cron-descriptor \
python313-cron-descriptor \
python3dist-cron-descriptor"

RDEPENDS:${PN} += "python-abi"

inherit rpm
