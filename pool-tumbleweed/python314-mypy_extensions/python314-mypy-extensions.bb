SUMMARY = "Experimental type system extensions for programs checked with mypy typechecker"
DESCRIPTION = "The 'mypy_extensions' module defines experimental extensions to the \
standard 'typing' module that are supported by the mypy typechecker."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python314-mypy_extensions-1.1.0-1.1.noarch.rpm"
RPM_HASH = "73965b35f7b68668f25e75bbb64b11b28c5315e892562cb225afd61012fc4e9c336a066c693ad2ab98c94fc6f274d5c6487ef75f78d4be96a1a67d09bf743d32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-mypy-extensions \
python314-mypy-extensions \
python3dist-mypy-extensions"

RDEPENDS:${PN} += "python-abi"

inherit rpm
