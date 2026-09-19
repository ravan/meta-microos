SUMMARY = "Python asyncio SMTP client"
DESCRIPTION = "Python asyncio SMTP client."
LICENSE = "MIT"

PV = "5.1.2"

RPM_NAME = "python313-aiosmtplib-5.1.2-1.1.noarch.rpm"
RPM_HASH = "de63599d3848d3258adeddaef436ed28b66735bd6404527dc5f73da8fac40a0277e3092cfd21d6125ed86a8280d7cf53ce0a7b89f8606cb6132bb3dcb4df6ccf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aiosmtplib \
python3.13dist-aiosmtplib \
python313-aiosmtplib \
python3dist-aiosmtplib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
