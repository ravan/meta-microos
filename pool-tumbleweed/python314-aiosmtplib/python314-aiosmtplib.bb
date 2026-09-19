SUMMARY = "Python asyncio SMTP client"
DESCRIPTION = "Python asyncio SMTP client."
LICENSE = "MIT"

PV = "5.1.2"

RPM_NAME = "python314-aiosmtplib-5.1.2-1.1.noarch.rpm"
RPM_HASH = "b2b6263752c9a159f66920fa308fad774837b81b120be86defecc4471130b568cd45a33b83bf3641370d297862d8463568f05f4e24f011b69343ccae15bf9542"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-aiosmtplib \
python314-aiosmtplib \
python3dist-aiosmtplib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
