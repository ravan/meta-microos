SUMMARY = "Microsoft App Configuration Provider Library for Python"
DESCRIPTION = "Azure App Configuration is a managed service that helps developers centralize their \
application configurations simply and securely. This provider adds additional \
functionality above the azure-sdk-for-python. \
 \
Using the provider enables loading sets of configurations from an Azure App \
Configuration store in a managed way."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "python314-azure-appconfiguration-provider-2.5.0-1.2.noarch.rpm"
RPM_HASH = "7cba55c4de758ad83f0f1a986a5710d31114c9b2f94d8b673e1c8823c8d1db18043afac0a362cacb32ae855dc05860101da068d7b1e5d3c6b82cd06ef6af4f63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-appconfiguration-provider \
python314-azure-appconfiguration-provider \
python3dist-azure-appconfiguration-provider"

RDEPENDS:${PN} += "-python314-azure-appconfiguration >= 1.8.0 with python314-azure-appconfiguration < 2.0.0 \
-python314-azure-core >= 1.30.0 with python314-azure-core < 2.0.0 \
-python314-azure-keyvault-secrets >= 4.3.0 with python314-azure-keyvault-secrets < 5.0.0 \
python-abi \
python314-azure-nspkg \
python314-dnspython"

inherit rpm
