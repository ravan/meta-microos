SUMMARY = "Microsoft Azure AgriFood Namespace Package"
DESCRIPTION = "This is the Microsoft Azure AgriFood namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.agrifood namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python314-azure-agrifood-nspkg-1.0.0-3.9.noarch.rpm"
RPM_HASH = "cad7efb3171f4af3461d7a8fae8f2b561b4717118fa854ad68c33035fc743a109b02ccdb784851fefbb0802a28ea694895c826fb775ed3a7f548934fd6918e24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-azure-agrifood-nspkg \
python314-azure-agrifood-nspkg \
python3dist-azure-agrifood-nspkg"

RDEPENDS:${PN} += "python-abi \
python314-azure-nspkg"

inherit rpm
