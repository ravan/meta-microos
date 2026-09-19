SUMMARY = "A code generator for executing Python snippets in source files"
DESCRIPTION = "Cog is a file generation tool. It lets you use pieces of Python code \
as generators in your source files to generate whatever text you \
need."
LICENSE = "MIT"

PV = "3.6.0"

RPM_NAME = "python314-cogapp-3.6.0-1.2.noarch.rpm"
RPM_HASH = "a103ad0af405cfa9ca0e88884555062e67651a0d92f10c3a3f1de88fb0f9d6b56b5c813b3dfa38338b9bccf73fa79d7bc623f8a9f1bbf28d6636a14f7c5d468b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-cogapp \
python314-cogapp \
python3dist-cogapp"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
