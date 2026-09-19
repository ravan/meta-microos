SUMMARY = "A Docker client for Python, designed to be fun and intuitive!"
DESCRIPTION = "A Docker client for Python, designed to be fun and intuitive!"
LICENSE = "MIT"

PV = "0.67.0"

RPM_NAME = "python313-python-on-whales-0.67.0-1.2.noarch.rpm"
RPM_HASH = "8685cbc0b5ecea34be1dd5ce8165a022304ca369e8d9511946b263f734cfb9786ad7e74fafcd41fc7e2a38cf248494f742ffdb70835c3512a5f08fd187c68a29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-on-whales \
python3.13dist-python-on-whales \
python313-python-on-whales \
python3dist-python-on-whales"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-pydantic \
python313-requests \
python313-tqdm \
python313-typer \
python313-typing-extensions"

inherit rpm
