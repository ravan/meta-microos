SUMMARY = "A code generator for executing Python snippets in source files"
DESCRIPTION = "Cog is a file generation tool. It lets you use pieces of Python code \
as generators in your source files to generate whatever text you \
need."
LICENSE = "MIT"

PV = "3.6.0"

RPM_NAME = "python313-cogapp-3.6.0-1.2.noarch.rpm"
RPM_HASH = "fb2dcf4577b601bb3267e5be20f2178c692b9a50e22766eb7a66ef9c9a8d30bf775348de1dd13b82f85d4272e9d7f731492fb5b4a03a3bc73190aea2c156c83d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cogapp \
python3.13dist-cogapp \
python313-cogapp \
python3dist-cogapp"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
