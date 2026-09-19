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

RPM_NAME = "python313-importlib-resources-7.1.0-1.2.noarch.rpm"
RPM_HASH = "4a4939ba26939a62061c1737b00685af2b463c1f340a725b5dc3a55afb9e24df59d8c8be97d26a92fd10878ed3f1e4ad205fa57ee2e927f8da769dc6bfc1aaad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-importlib-resources \
python3.13dist-importlib-resources \
python313-importlib-resources \
python3dist-importlib-resources"

RDEPENDS:${PN} += "python-abi"

inherit rpm
