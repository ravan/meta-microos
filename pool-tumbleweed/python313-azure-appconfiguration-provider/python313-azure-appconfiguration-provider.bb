SUMMARY = "Microsoft App Configuration Provider Library for Python"
DESCRIPTION = "Azure App Configuration is a managed service that helps developers centralize their \
application configurations simply and securely. This provider adds additional \
functionality above the azure-sdk-for-python. \
 \
Using the provider enables loading sets of configurations from an Azure App \
Configuration store in a managed way."
LICENSE = "MIT"

PV = "2.5.0"

RPM_NAME = "python313-azure-appconfiguration-provider-2.5.0-1.2.noarch.rpm"
RPM_HASH = "66624b540d1f0c17810b46287afc46c67b3b25f0f425600948942ae3077c58725415139ce4fc53194298b15517fb5cd00a48088ddcf4d55111070ef721653dab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-azure-appconfiguration-provider \
python3.13dist-azure-appconfiguration-provider \
python313-azure-appconfiguration-provider \
python3dist-azure-appconfiguration-provider"

RDEPENDS:${PN} += "-python313-azure-appconfiguration >= 1.8.0 with python313-azure-appconfiguration < 2.0.0 \
-python313-azure-core >= 1.30.0 with python313-azure-core < 2.0.0 \
-python313-azure-keyvault-secrets >= 4.3.0 with python313-azure-keyvault-secrets < 5.0.0 \
python-abi \
python313-azure-nspkg \
python313-dnspython"

inherit rpm
