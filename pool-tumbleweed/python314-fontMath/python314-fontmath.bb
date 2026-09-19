SUMMARY = "A set of objects for performing math operations on font data"
DESCRIPTION = "A set of objects for performing math operations on font data."
LICENSE = "MIT"

PV = "0.10.0"

RPM_NAME = "python314-fontMath-0.10.0-1.3.noarch.rpm"
RPM_HASH = "b12aa87433702c6c3e5b7188d59eac494f5ca2656c80a878448a0054d244b859e7770021fea691d68a0e0e8681c70ee145e4ca7065e861a5967774fa29f6116c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-fontmath \
python314-fontMath \
python3dist-fontmath"

RDEPENDS:${PN} += "python-abi \
python314-FontTools"

inherit rpm
