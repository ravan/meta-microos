SUMMARY = "Traits-capable windowing framework"
DESCRIPTION = "The pyface project contains a toolkit-independent GUI abstraction layer, \
which is used to support the 'visualization' features of the Traits package. \
Thus, you can write code in terms of the Traits API (views, items, editors, \
etc.), and let pyface and your selected toolkit and back-end take care of \
the details of displaying them. \
 \
Part of the Enthought Tool Suite (ETS)."
LICENSE = "BSD-3-Clause & EPL-1.0 & LGPL-2.1-only & LGPL-3.0-only & LicenseRef-SUSE-Public-Domain"

PV = "8.0.0"

RPM_NAME = "python313-pyface-8.0.0-6.2.noarch.rpm"
RPM_HASH = "45e8c6cf57b401724e397a804eef8baa48d5e61ef80bc5697aa6eca0f493c129d4eb639e7676285a10cf82f6dca1e6d62d23b531ec9fe7c9ec2facebc5e2b438"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyface \
python3.13dist-pyface \
python313-pyface \
python3dist-pyface"

RDEPENDS:${PN} += "python-abi \
python313-traits"

inherit rpm
