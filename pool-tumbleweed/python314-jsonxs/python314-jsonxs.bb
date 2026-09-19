SUMMARY = "Get/set values in JSON and Python datastructures"
DESCRIPTION = "JSONxs is a Python library that uses a path expression string to get and \
set values in JSON and Python datastructures. It's slightly similar to \
JSONPath, but supports only simpler expressions and allows \
modifications. \
JSONxs is safe to use with untrusted input."
LICENSE = "MIT"

PV = "0.6"

RPM_NAME = "python314-jsonxs-0.6-2.5.noarch.rpm"
RPM_HASH = "9cd9e28fe77f57c45af5e0d2eeba9a2564d327462de0517ef73973c795dab9ffbf86ee3b151b4da0b3f37c484b8e21534d1528e4f0f915d5367e7c1555f9017f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jsonxs \
python314-jsonxs \
python3dist-jsonxs"

RDEPENDS:${PN} += "python-abi"

inherit rpm
