SUMMARY = "Python asyncio SMTP client"
DESCRIPTION = "Python asyncio SMTP client."
LICENSE = "MIT"

PV = "5.1.0"

RPM_NAME = "python311-aiosmtplib-5.1.0-1.1.noarch.rpm"
RPM_HASH = "0210e58d0240e6598ed07ac9cbbd4ecf4ad76e303b13d27efa93fe24e29c10a2db84663da195b69a24c007d5a2038cbab42fd968d08f0a09191a8234954f4291"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-aiosmtplib \
python311-aiosmtplib \
python3dist-aiosmtplib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
