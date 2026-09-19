SUMMARY = "Pytest plugin for echoing build environment attributes"
DESCRIPTION = "pytest plugin with mechanisms for echoing environment variables, \
package version and generic attributes."
LICENSE = "MIT"

PV = "2.0.1"

RPM_NAME = "python314-pytest-echo-2.0.1-1.6.noarch.rpm"
RPM_HASH = "d6a9a28cae872e92fe79369fe6cedbe7992c11ce7c2ec4a413fde7cafa0b013946d45cb7c3961077fde6dbe449928c25f36240dbecedf5e17a6e816e47d28305"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-echo \
python314-pytest-echo \
python3dist-pytest-echo"

RDEPENDS:${PN} += "python-abi \
python314-pytest"

inherit rpm
