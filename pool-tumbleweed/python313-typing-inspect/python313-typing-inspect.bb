SUMMARY = "Python runtime inspection utilities for typing"
DESCRIPTION = "Python runtime inspection utilities for typing module."
LICENSE = "MIT"

PV = "0.9.0"

RPM_NAME = "python313-typing-inspect-0.9.0-3.4.noarch.rpm"
RPM_HASH = "403863ab1caa21b1c80b5dd34c9983b154b06bf4f25a1d5790f021f8bf13e443c0d3c1d94fe22b4db94740e185a656561a25f0351067c6970a11966963f972fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-typing-inspect \
python3.13dist-typing-inspect \
python313-typing-inspect \
python3dist-typing-inspect"

RDEPENDS:${PN} += "python-abi \
python313-mypy-extensions \
python313-typing-extensions"

inherit rpm
