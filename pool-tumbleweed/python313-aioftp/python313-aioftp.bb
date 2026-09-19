SUMMARY = "FTP client/server for asyncio"
DESCRIPTION = "aioftp is a python FTP client/server based on asyncio."
LICENSE = "Apache-2.0"

PV = "0.27.2"

RPM_NAME = "python313-aioftp-0.27.2-1.4.noarch.rpm"
RPM_HASH = "6ada52a45dbca43d914e720d6b7f7f47c5f9925239e0eff59c0d4473320bff3a4d654d71364debef7e7666c62ae9a453e12f784b0f0beca908647541e7d4081f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aioftp \
python3.13dist-aioftp \
python313-aioftp \
python3dist-aioftp"

RDEPENDS:${PN} += "python-abi \
python313-siosocks"

inherit rpm
