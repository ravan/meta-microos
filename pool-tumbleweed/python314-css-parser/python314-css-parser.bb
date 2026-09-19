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

RPM_NAME = "python314-css-parser-1.0.10-3.3.noarch.rpm"
RPM_HASH = "a1e4e8f312ddc02b97b7b8b470ec5457fbaba317de5b41edc834f8793b41c144bdcdb410d381c0a9e8694ace4012e94d6d15b3996f631df7bc2789eec7573a68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-css-parser \
python314-css-parser \
python3dist-css-parser"

RDEPENDS:${PN} += "python-abi"

inherit rpm
