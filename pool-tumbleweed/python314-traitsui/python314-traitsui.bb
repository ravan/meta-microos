SUMMARY = "Traits-capable windowing framework"
DESCRIPTION = "The TraitsGUI project contains a toolkit-independent GUI abstraction layer \
(known as Pyface), which is used to support the 'visualization' features of \
the Traits package. Thus, you can write code in terms of the Traits API \
(views, items, editors, etc.), and let TraitsGUI and your selected toolkit \
and back-end take care of the details of displaying them. \
 \
Part of the Enthought Tool Suite (ETS)."
LICENSE = "BSD-3-Clause & EPL-1.0 & LGPL-2.1-only & LGPL-3.0-only"

PV = "8.0.0"

RPM_NAME = "python314-traitsui-8.0.0-1.12.noarch.rpm"
RPM_HASH = "f2c6134a94fef8cc97187bce612248be138275ef1610f4ebf80bf7afe3b03acbf2ca548968954a4fa651a7841231ec858dfae94e5e39eb1fc61dc7051e3f9e0c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-traitsui \
python314-traitsui \
python3dist-traitsui"

RDEPENDS:${PN} += "python-abi \
python314-pyface \
python314-traits"

inherit rpm
