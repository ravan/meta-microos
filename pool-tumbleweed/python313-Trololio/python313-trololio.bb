SUMMARY = "Trollius and asyncio compatibility library"
DESCRIPTION = "Trololio provides a compatibility layer for Trollius and asyncio (aka Tulip). \
It addresses the differences listed in Trollius and Tulip: \
 \
* Allows the use of Trollius' syntax with asyncio. \
* Provides missing objects and aliases for the others. \
* Synchronizes debug environnement variables."
LICENSE = "MIT"

PV = "1.0"

RPM_NAME = "python313-Trololio-1.0-4.5.noarch.rpm"
RPM_HASH = "de15342e0fd2e59b94334f8f89a8ff39a278cae4fe6c4ee3a710d2cd61bc1f6c30a42a001394a7b053a4e69299d437728716a6198b50fa71043f763fa2417f78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Trololio \
python3.13dist-trololio \
python313-Trololio \
python3dist-trololio"

RDEPENDS:${PN} += "python-abi"

inherit rpm
