SUMMARY = "Replacement for Make"
DESCRIPTION = "SCons is a make replacement that provides a range of enhanced features, \
such as automated dependency generation and built-in compilation cache \
support. SCons rule sets are Python scripts, which means that SCons \
provides itself as well as the features. SCons allows you to use the \
full power of Python to control compilation."
LICENSE = "MIT"

PV = "4.10.1"

RPM_NAME = "scons-4.10.1-4.1.noarch.rpm"
RPM_HASH = "09cf8a40f0463e6c7a1a20e6d949720d591669fcbcd03a831aef914be313585cf71b8b23c487d9e4d6ec80fa1d61d65d7eebb71ca7666f6fbff40a005080eca4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.13dist-scons \
python3dist-scons \
scons"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi"

inherit rpm
