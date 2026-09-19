SUMMARY = "Unbearably fast runtime type checking in pure Python"
DESCRIPTION = "Unbearably fast runtime type checking in pure Python."
LICENSE = "MIT"

PV = "0.22.9"

RPM_NAME = "python314-beartype-0.22.9-2.3.noarch.rpm"
RPM_HASH = "b16af7e1fb456bbee4b19971e0903f6249f6ea0cf8d05661777cc520e9ef5aff8472158d167456316223badb56f7431c6b4747fcc3f0a102a94abe4d4f67b03e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-beartype \
python314-beartype \
python3dist-beartype"

RDEPENDS:${PN} += "python-abi"

inherit rpm
