SUMMARY = "Python implementation of the Varlink protocol"
DESCRIPTION = "A varlink implementation for Python. \
 \
Varlink is an interface description format and protocol that \
makes services accessible to both humans and machines."
LICENSE = "Apache-2.0"

PV = "31.0.0"

RPM_NAME = "python314-varlink-31.0.0-2.12.noarch.rpm"
RPM_HASH = "472f684dc27a654822e040cd6f51f3700320be6cc3db6380e1d4ed70bb2ee96dedd3b4cf506fa4947491667ef9edc19ded0d62a05d9432b93559fe24233aec45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-varlink \
python314-varlink \
python3dist-varlink"

RDEPENDS:${PN} += "/usr/bin/env \
python-abi"

inherit rpm
