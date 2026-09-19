SUMMARY = "Bash Automated Testing System"
DESCRIPTION = "Bats is a TAP-compliant (http://testanything.org/) testing framework for Bash. \
It provides a simple and repeatable way to verify that the UNIX programs you \
write behave as expected. \
 \
A Bats test file is a Bash script with special syntax for defining test cases. \
Under the hood, each test case is just a function with a description. \
 \
Bats is most useful when testing software written in Bash, but you can use it \
to test any UNIX program."
LICENSE = "MIT"

PV = "1.14.0"

RPM_NAME = "bats-1.14.0-1.1.noarch.rpm"
RPM_HASH = "aeadb7eb86b492a04842423fcb1e43c472ef9e11d515978f9d62d85bb890d23b227e68449640969799e6c1bd4f782d38291ebb876bced94125f747552aa34887"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bats"

RDEPENDS:${PN} += "/usr/bin/bash \
gnu-parallel"

inherit rpm
