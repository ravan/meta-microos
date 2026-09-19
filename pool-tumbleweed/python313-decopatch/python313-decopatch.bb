SUMMARY = "python decorators made easy."
DESCRIPTION = "Because of a tiny oddity in the python language, writing decorators without \
help can be a pain because you have to handle the no-parenthesis usage \
explicitly. decopatch provides a simple way to solve this issue so that writing \
decorators is simple and straightforward."
LICENSE = "BSD-3-Clause"

PV = "1.4.10"

RPM_NAME = "python313-decopatch-1.4.10-1.9.noarch.rpm"
RPM_HASH = "071a4251b15be216c26455bf20e7fa74bd08a30020f46975e693ed349e92f5e44914841891402eb9c3ba9dd4fbad3d92512a4da139107d0a6ee5c5db8539ae3b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-decopatch \
python3.13dist-decopatch \
python313-decopatch \
python3dist-decopatch"

RDEPENDS:${PN} += "python-abi \
python313-makefun"

inherit rpm
