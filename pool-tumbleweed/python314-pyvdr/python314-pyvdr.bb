SUMMARY = "Python library for accessing a Linux VDR via SVDRP"
DESCRIPTION = "Python library for accessing a Linux VDR via SVDRP."
LICENSE = "MIT"

PV = "0.3.1"

RPM_NAME = "python314-pyvdr-0.3.1-2.5.noarch.rpm"
RPM_HASH = "57d61e465a2c55286fc6be292086882aaa49836aefe049a3932483349d89148b622a0be564339058213a2348500c560c6714669a812564ada03e2e26450d0e49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyvdr \
python314-pyvdr \
python3dist-pyvdr"

RDEPENDS:${PN} += "python-abi"

inherit rpm
