SUMMARY = "Abseil Python Common Libraries"
DESCRIPTION = "This package is a collection of Python library code for building Python \
applications. The code is collected from Google's own Python code base, and has \
been extensively tested and used in production. \
* Simple application startup \
* Distributed commandline flags system \
* Custom logging module with additional features \
* Testing utilities"
LICENSE = "Apache-2.0"

PV = "2.1.0"

RPM_NAME = "python313-abseil-2.1.0-2.5.noarch.rpm"
RPM_HASH = "a9a6e3accd23014e169d1bad34890f6d0e9dbbd437c213fcf6936050721cd895a746178418d6014011fbb6346f1e64b241f868689b1da55216af9b000b3f70be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-abseil \
python3-absl-py \
python3.13dist-absl-py \
python313-abseil \
python313-absl-py \
python3dist-absl-py"

RDEPENDS:${PN} += "python-abi"

inherit rpm
