SUMMARY = "Asyncio wait_for that handles simultaneous cancellation and future completion"
DESCRIPTION = "Alternate implementation of asyncio.wait_for() that handles several \
edge cases like simultaneous cancellation and completion of futures \
consistently across Python versions."
LICENSE = "Apache-2.0"

PV = "0.4.1"

RPM_NAME = "python314-wait-for2-0.4.1-1.2.noarch.rpm"
RPM_HASH = "eb31b557e4b6090e2967eda045366f5d4a40c60b0b9d29309537d6319ac7401f900c59331648ca758686a7d3448be8f61654ffe11a623a9b40e667cfbe24bb00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-wait-for2 \
python314-wait-for2 \
python3dist-wait-for2"

RDEPENDS:${PN} += "python-abi"

inherit rpm
