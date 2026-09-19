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

RPM_NAME = "python314-abseil-2.1.0-2.5.noarch.rpm"
RPM_HASH = "f814d9d8f974e7ab699017aef1ff7e0b120ea15136c8663b7a50459e9bbcf585850b718ccf603393442180c61b2fdcc38a870d86f47f4c16cfff7cd9ffd41ea8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-absl-py \
python314-abseil \
python314-absl-py \
python3dist-absl-py"

RDEPENDS:${PN} += "python-abi"

inherit rpm
