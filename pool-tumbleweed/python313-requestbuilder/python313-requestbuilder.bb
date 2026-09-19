SUMMARY = "Command line-driven HTTP request builder"
DESCRIPTION = "Command line-driven HTTP request builder"
LICENSE = "ISC"

PV = "0.7.1"

RPM_NAME = "python313-requestbuilder-0.7.1-2.5.noarch.rpm"
RPM_HASH = "27f397bfcad58fbecc38960a3381b22b63d9cd836e7d0e1580aadfc5c1c5aae319057f3a00cb6413925bff5df1263935bd57c29e4d34add6ac1ca5c936733987"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requestbuilder \
python3.13dist-requestbuilder \
python313-requestbuilder \
python3dist-requestbuilder"

RDEPENDS:${PN} += "python-abi"

inherit rpm
