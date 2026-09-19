SUMMARY = "Asyncio wait_for that handles simultaneous cancellation and future completion"
DESCRIPTION = "Alternate implementation of asyncio.wait_for() that handles several \
edge cases like simultaneous cancellation and completion of futures \
consistently across Python versions."
LICENSE = "Apache-2.0"

PV = "0.4.1"

RPM_NAME = "python313-wait-for2-0.4.1-1.2.noarch.rpm"
RPM_HASH = "b3b3865f7ea96c6dcb8a72bc43404307bb2e964ec063d9b89b93a9ca18ae8f11828d20f5ad0d20a7f1befc47f56465149512c9d0cb466eca972b318cc11e2605"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-wait-for2 \
python3.13dist-wait-for2 \
python313-wait-for2 \
python3dist-wait-for2"

RDEPENDS:${PN} += "python-abi"

inherit rpm
