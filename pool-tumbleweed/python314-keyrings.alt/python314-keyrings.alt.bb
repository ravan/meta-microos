SUMMARY = "Alternate keyring implementations"
DESCRIPTION = "Alternate keyring backend implementations for use with the \
keyring package."
LICENSE = "MIT"

PV = "5.0.2"

RPM_NAME = "python314-keyrings.alt-5.0.2-1.5.noarch.rpm"
RPM_HASH = "124f7d2962e3fa0cdc2f6171201cde77e26616e79b7bddf4b0799751894447c0bbc88cd58e0d22d0f4ce2ea9acd3662bbd876f5d9ea96a3783b3ce913d88f66b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-keyrings.alt \
python314-keyrings.alt \
python3dist-keyrings.alt"

RDEPENDS:${PN} += "python-abi \
python314-jaraco.classes \
python314-jaraco.context"

inherit rpm
