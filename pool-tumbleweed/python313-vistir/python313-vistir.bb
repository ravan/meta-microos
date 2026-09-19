SUMMARY = "Utilities for filesystems, paths, projects, subprocesses, and more"
DESCRIPTION = "Miscellaneous utilities for dealing with filesystems, paths, projects, \
subprocesses, and more."
LICENSE = "ISC"

PV = "0.8.0"

RPM_NAME = "python313-vistir-0.8.0-4.1.noarch.rpm"
RPM_HASH = "2076d523746d7ef1ba6ded7ea7f31d2b4626e366ff97123de3e6f4c6bc6ef09c3dd6d249e91151c25094a2f59b58e9b503fd9d9a0c6e59febc67f0cee5cae063"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-vistir \
python3.13dist-vistir \
python313-vistir \
python3dist-vistir"

RDEPENDS:${PN} += "python-abi \
python313-colorama"

inherit rpm
