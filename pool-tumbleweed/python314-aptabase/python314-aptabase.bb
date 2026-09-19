SUMMARY = "Python SDK for Aptabase"
DESCRIPTION = "Python SDK for Aptabase - privacy-first analytics for mobile, desktop and web applications."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "python314-aptabase-0.1.0-1.1.noarch.rpm"
RPM_HASH = "1114c7d611107c8128dbbe479d9252f8da6901b483df05b31f894fa2cb1b808d1f59e55b2875b01f219d97b59c07585e1cf572844885dc89106f9739d825d1a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-aptabase \
python314-aptabase \
python3dist-aptabase"

RDEPENDS:${PN} += "python-abi \
python313-base \
python313-httpx \
python314"

inherit rpm
