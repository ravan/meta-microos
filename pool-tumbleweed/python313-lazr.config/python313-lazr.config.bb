SUMMARY = "Create configuration schemas, and process and validate configurations"
DESCRIPTION = "Create configuration schemas, and process and validate configurations."
LICENSE = "LGPL-3.0-only"

PV = "3.1"

RPM_NAME = "python313-lazr.config-3.1-1.2.noarch.rpm"
RPM_HASH = "1f3b90d6ff7131841c83cef5f4ac4d1c7c8217d46935c0626bffb672c14a4ca447dcdb89b1e2c08143d92ed825de31f4dc7a6eae9a664c44ae8da1935272313e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-lazr.config \
python3.13dist-lazr.config \
python313-lazr.config \
python3dist-lazr.config"

RDEPENDS:${PN} += "python-abi \
python313-lazr.delegates \
python313-zope.interface"

inherit rpm
