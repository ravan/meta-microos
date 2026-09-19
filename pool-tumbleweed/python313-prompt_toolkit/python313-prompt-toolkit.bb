SUMMARY = "Library for building interactive command lines in Python"
DESCRIPTION = "Prompt toolkit is a library for building interactive command \
lines in Python."
LICENSE = "BSD-3-Clause"

PV = "3.0.53"

RPM_NAME = "python313-prompt_toolkit-3.0.53-1.1.noarch.rpm"
RPM_HASH = "18fb0aa2762be853604c58fc639f585db96752dc14356f23039a7a51f76fbda3866a2c173e65732de6e574517d45129e36a217636c176a4fb4be7cb04ed6454c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-prompt-toolkit \
python3.13dist-prompt-toolkit \
python313-prompt-toolkit \
python3dist-prompt-toolkit"

RDEPENDS:${PN} += "python-abi \
python313-wcwidth"

inherit rpm
