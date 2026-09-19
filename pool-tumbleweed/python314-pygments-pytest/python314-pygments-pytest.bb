SUMMARY = "A pygments lexer for pytest output"
DESCRIPTION = "This library provides a pygments lexer called 'pytest'."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "python314-pygments-pytest-2.5.0-1.4.noarch.rpm"
RPM_HASH = "b82b27f42ccf0c993e913a8cc157187c49f2731415c60f00f496b86385777cea81dbc3de2c3c257b1ea212f44d75a52f9c9231b0f7454669d2cfff5c9f7cf6f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pygments-pytest \
python314-pygments-pytest \
python3dist-pygments-pytest"

RDEPENDS:${PN} += "python-abi \
python314-pygments \
python314-pytest"

inherit rpm
