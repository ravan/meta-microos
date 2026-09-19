SUMMARY = "Python runtime inspection utilities for typing"
DESCRIPTION = "Python runtime inspection utilities for typing module."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python314-typing-inspect-0.9.0-3.4.noarch.rpm"
RPM_HASH = "f554bc6512241b35ad35f6813ccf2488e3a75647ac2280d42f41aecd08b8e78a9e0058401f0096855f78211b0596a778eb948cea989b11ba40d68db14798adc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-typing-inspect \
python314-typing-inspect \
python3dist-typing-inspect"

RDEPENDS:${PN} += "python-abi \
python314-mypy-extensions \
python314-typing-extensions"

inherit rpm
