SUMMARY = "Experimental type system extensions for programs checked with mypy typechecker"
DESCRIPTION = "The 'mypy_extensions' module defines experimental extensions to the \
standard 'typing' module that are supported by the mypy typechecker."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python313-mypy_extensions-1.1.0-1.1.noarch.rpm"
RPM_HASH = "a21cc062cb5c0bfbee566a4de403fce9eadda427e42fdebab18d39121680117149ce9f80c15e3b352fa483835f88d75070d808ff881d05a794a928eac2854d91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mypy-extensions \
python3.13dist-mypy-extensions \
python313-mypy-extensions \
python3dist-mypy-extensions"

RDEPENDS:${PN} += "python-abi"

inherit rpm
