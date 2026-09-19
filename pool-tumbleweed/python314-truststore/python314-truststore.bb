SUMMARY = "Verify certificates using OS trust stores"
DESCRIPTION = "Verify certificates using OS trust stores. Supports macOS, \
Windows, and Linux (with OpenSSL). This project should be \
considered experimental."
LICENSE = "MIT"

PV = "0.10.4"

RPM_NAME = "python314-truststore-0.10.4-1.4.noarch.rpm"
RPM_HASH = "d710dfccb819b05e21666c3143c18b363c4790f2c683c3cef3ef959807fba3beb8af18a5d129e5433f81574d8428b70ea5ea46cfb051a8f85faaefa9f32e937e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-truststore \
python314-truststore \
python3dist-truststore"

RDEPENDS:${PN} += "python-abi"

inherit rpm
