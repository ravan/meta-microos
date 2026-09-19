SUMMARY = "A fork to traitlets' link and dlink to link traits in addition to traitlets"
DESCRIPTION = "A fork to traitlets' link and dlink to link traits in addition to traitlets."
LICENSE = "BSD-3-Clause"

PV = "1.0.3"

RPM_NAME = "python314-link-traits-1.0.3-2.5.noarch.rpm"
RPM_HASH = "1914e089b1947583fbe0ade26c9d1018d62f846bb84469a797c941e37641b4fc63ccc3a68887b612c516151c994cf267b407b6d2ccb2e9bb12a010d67ff70bf1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-link-traits \
python314-link-traits \
python3dist-link-traits"

RDEPENDS:${PN} += "python-abi \
python314-traits"

inherit rpm
