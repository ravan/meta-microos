SUMMARY = "Digital Forensics Artifact Repository Validator"
DESCRIPTION = "Python modules and program to validate the artifact data. It is \
possible for programs to directly call these Python modules, but, by \
design, said programs should work directly with the YAML files \
themselves and not use these Python modules."
LICENSE = "Apache-2.0"

PV = "20221219"

RPM_NAME = "artifacts-validator-20221219-4.4.noarch.rpm"
RPM_HASH = "340651561e888849ca7ec151ac1dbd1ed1249c97163d76232533bdc42b393be45d32d9e3ced951ab5b8645dac3e430002edb23465a8c88a5a8dc1b15655fee8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "artifacts-validator \
python3.13dist-artifacts \
python3dist-artifacts"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
artifacts \
python-abi \
python3-PyYAML \
python3-pip"

inherit rpm
