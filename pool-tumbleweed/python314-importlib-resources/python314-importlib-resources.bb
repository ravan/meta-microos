SUMMARY = "Read resources from Python packages"
DESCRIPTION = "importlib_resources is a library which provides for access to resources in \
Python packages. It provides functionality similar to pkg_resources Basic \
Resource Access API, but without all of the overhead and performance problems \
of pkg_resources. \
 \
In our terminology, a resource is a file tree that is located alongside an \
importable Python module. Resources can live on the file system or in a zip \
file, with support for other loader classes that implement the appropriate API \
for reading resources. \
 \
importlib_resources supplies a backport of importlib.resources, enabling early \
access to features of future Python versions and making functionality available \
for older Python versions. Users are encouraged to use the Python standard \
library where suitable and fall back to this library for future compatibility. \
Developers looking for detailed API descriptions should refer to the standard \
library documentation."
LICENSE = "Apache-2.0"

PV = "7.1.0"

RPM_NAME = "python314-importlib-resources-7.1.0-1.2.noarch.rpm"
RPM_HASH = "1cac632bcb8ffd6537b2e3c48fcc048b484f9b647e615500c8876b2eadaff9e0a523f19df48456dc0c0ae2e4156b0c2b89b98b15846de4254ec5ca2191aa10ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-importlib-resources \
python314-importlib-resources \
python3dist-importlib-resources"

RDEPENDS:${PN} += "python-abi"

inherit rpm
