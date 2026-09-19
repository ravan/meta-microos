SUMMARY = "A pyunit extension for managing expensive test resources"
DESCRIPTION = "testresources: extensions to python unittest to allow declarative use \
of resources by test cases."
LICENSE = "(Apache-2.0 | BSD-3-Clause) & GPL-2.0-or-later"

PV = "2.1.2"

RPM_NAME = "python313-testresources-2.1.2-1.3.noarch.rpm"
RPM_HASH = "28f963f6fbe0ccca364f6e18c92be9a81a8e1bc0ad8569a195612e56632bdb50b638a76c6e23fb2aff1ee4e9b98f454e77c6e50ca224994546baff3d632d10a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-testresources \
python3.13dist-testresources \
python313-testresources \
python3dist-testresources"

RDEPENDS:${PN} += "python-abi"

inherit rpm
