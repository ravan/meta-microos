SUMMARY = "Verify certificates using OS trust stores"
DESCRIPTION = "Verify certificates using OS trust stores. Supports macOS, \
Windows, and Linux (with OpenSSL). This project should be \
considered experimental."
LICENSE = "MIT"

PV = "0.10.4"

RPM_NAME = "python313-truststore-0.10.4-1.4.noarch.rpm"
RPM_HASH = "a430a766601adbb243d6b39ac45572780a1b8a120c00edd717052bf828849722fe39f93190dbe110532a61ab7a670a110445cade5bf0534d0e04197158bae89c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-truststore \
python3.13dist-truststore \
python313-truststore \
python3dist-truststore"

RDEPENDS:${PN} += "python-abi"

inherit rpm
