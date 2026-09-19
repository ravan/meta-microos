SUMMARY = "Make asynchat available for Python 312 onwards"
DESCRIPTION = "Make asynchat available for Python 3.12 onwards"
LICENSE = "PSF-2.0"

PV = "1.0.5"

RPM_NAME = "python313-pyasynchat-1.0.5-1.3.noarch.rpm"
RPM_HASH = "360de2359f62bdb09b8a875be5431b8490c9c6da6323ec8d4f960c4e2dce11736ccc1756ac495acb8a77357eecd2cc530bd2e8fc18a864018e7d6593bdaa7c01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyasynchat \
python3.13dist-pyasynchat \
python313-pyasynchat \
python3dist-pyasynchat"

RDEPENDS:${PN} += "python-abi \
python313-pyasyncore"

inherit rpm
