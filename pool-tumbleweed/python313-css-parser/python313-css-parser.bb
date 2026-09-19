SUMMARY = "CSS related utilities (parsing, serialization, etc) for python"
DESCRIPTION = "CSS related utilities (parsing, serialization, etc) for python \
 \
A fork of the cssutils project based on version 1.0.2. This fork \
includes general bug fixes and extensions specific to editing and \
working with ebooks. \
 \
The main python source code has been modified so that it will run \
without further conversion on both Python >= 2.7 and Python 3.X without \
any further modules required. All required modifications are handled \
local to each file"
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.10"

RPM_NAME = "python313-css-parser-1.0.10-3.3.noarch.rpm"
RPM_HASH = "059c77860fc3278634c039f12c0c61aa29a5197ad3e91284e27d6a06bdbeeb8a8d372429a0bb271dad1b053fd98cc67b49c13a4173f9346276ac18f1cbc58d44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-css-parser \
python3.13dist-css-parser \
python313-css-parser \
python3dist-css-parser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
