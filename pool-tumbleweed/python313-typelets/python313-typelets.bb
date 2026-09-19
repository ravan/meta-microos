SUMMARY = "Type hints and utility objects for Python and Django projects"
DESCRIPTION = "A collection of type hints and small utility objects for use in Python \
and Django projects."
LICENSE = "MIT"

PV = "1.1"

RPM_NAME = "python313-typelets-1.1-1.2.noarch.rpm"
RPM_HASH = "393be60ee197bd67832feb527b8334f01e679b82cbba2b1f4a7c8e0cec633255e81104ee625e1cb976a1006af48f69483c989c3de80fd4943133a0c4897a5e7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-typelets \
python3.13dist-typelets \
python313-typelets \
python3dist-typelets"

RDEPENDS:${PN} += "python-abi \
python313-typing-extensions"

inherit rpm
