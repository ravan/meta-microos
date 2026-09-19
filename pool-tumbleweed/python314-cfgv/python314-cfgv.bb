SUMMARY = "Configuration validator producing human readable error messages"
DESCRIPTION = "A configuration validator for Python that produce human readable error messages."
LICENSE = "MIT"

PV = "3.5.0"

RPM_NAME = "python314-cfgv-3.5.0-1.4.noarch.rpm"
RPM_HASH = "9ef1427212442e96dc3c861b6471ef3e388bc822416c93427492c011cc6aad4f2ad8651bccadcd9c80c4f2bbe8a58cb15bc44bbc3d5ba3f6e46477b7c075c46a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-cfgv \
python314-cfgv \
python3dist-cfgv"

RDEPENDS:${PN} += "python-abi"

inherit rpm
