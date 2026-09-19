SUMMARY = "A library to handle automated deprecations"
DESCRIPTION = "The `deprecation` library provides a `deprecated` decorator and a \
`fail_if_not_removed` decorator for your tests. Together, the two \
enable the automation of several things:"
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "python314-deprecation-2.1.0-4.10.noarch.rpm"
RPM_HASH = "fe27010a1e4d77f3178e39abf053ed69fcce844f71624ebdee759ec6c23ac0e08eb08b9bf54f2e5cbf6ee0eaf4f5a994d5d70531813e781361c8b795edb5f8e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-deprecation \
python314-deprecation \
python3dist-deprecation"

RDEPENDS:${PN} += "python-abi \
python314-packaging"

inherit rpm
