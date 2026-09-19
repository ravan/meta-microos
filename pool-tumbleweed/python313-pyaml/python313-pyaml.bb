SUMMARY = "Python module to produce formatted YAML-serialized data"
DESCRIPTION = "PyYAML-based python module to produce formatted YAML-serialized data."
LICENSE = "WTFPL"

PV = "26.7.0"

RPM_NAME = "python313-pyaml-26.7.0-1.1.noarch.rpm"
RPM_HASH = "9dc457c748bc1f6098fc2ebc79655d60570b0b464fc18974f9f5b8cf5f27cc567b2593f2b155e35464b1d46cec04afab457afd64aa9905c2c3042d4901c9f39a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyaml \
python3.13dist-pyaml \
python313-pyaml \
python3dist-pyaml"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-PyYAML \
update-alternatives"

inherit rpm
