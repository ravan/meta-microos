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

RPM_NAME = "python314-pyface-8.0.0-6.2.noarch.rpm"
RPM_HASH = "cce6f0f02b25f6c7f72add0c4e8337bfdcd83e9c4b99ea45291467b7cde4bbfb1036642710e82c095927ba8275e7bc04c919dc6411374f6992c0b2d1a31fdfc8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyface \
python314-pyface \
python3dist-pyface"

RDEPENDS:${PN} += "python-abi \
python314-traits"

inherit rpm
