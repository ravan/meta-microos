SUMMARY = "python decorators made easy."
DESCRIPTION = "Because of a tiny oddity in the python language, writing decorators without \
help can be a pain because you have to handle the no-parenthesis usage \
explicitly. decopatch provides a simple way to solve this issue so that writing \
decorators is simple and straightforward."
LICENSE = "BSD-3-Clause"

PV = "1.4.10"

RPM_NAME = "python314-decopatch-1.4.10-1.9.noarch.rpm"
RPM_HASH = "8fc685ba8127ac673d82a20928c68f23a8e4f5a832917e157f24cd65b6e6c94e6028607ebb29cd83f1611a3e0c4a11f8a3be80d9239c3eaa1d9c9b8c16d1f15f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-decopatch \
python314-decopatch \
python3dist-decopatch"

RDEPENDS:${PN} += "python-abi \
python314-makefun"

inherit rpm
