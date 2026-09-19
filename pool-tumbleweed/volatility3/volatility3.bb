SUMMARY = "Volatile memory artifact extraction utility framework"
DESCRIPTION = "The Volatility Framework is a collection of tools, implemented in \
Python for the extraction of digital artifacts from volatile memory \
(RAM) samples. The extraction techniques are performed independent of \
the system being investigated but offer visibilty into the runtime \
state of the system."
LICENSE = "BSD-2-Clause-Patent"

PV = "2.11.0"

RPM_NAME = "volatility3-2.11.0-1.4.noarch.rpm"
RPM_HASH = "b6b37f9793b4e2b4d883aea0f8835149b0649202cf3f8097e8a7e223910eb61fcec55510c486e72a429173afe1b02764b25a61b318ece7da9bf717ca9f4aee96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-volatility \
python3.13dist-volatility3 \
python38-volatility \
python3dist-volatility3 \
volatility \
volatility3"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
capstone \
python-abi \
python3-pefile \
python3-pycryptodome \
python3-yara"

inherit rpm
