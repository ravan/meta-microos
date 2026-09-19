SUMMARY = "Remote lookup tables for agate"
DESCRIPTION = "Agate-lookup adds one-line access to lookup tables to agate."
LICENSE = "MIT"

PV = "0.3.4"

RPM_NAME = "python313-agate-lookup-0.3.4-1.4.noarch.rpm"
RPM_HASH = "216c8b65ed7991bfe16f99bc509bcf18077ceca8dfdceeab792a71cf22bd0711b322f10f643c9b27e5e7985424ed0f8f2113fc11a1e757a2611050b6ec06cd35"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-agate-lookup \
python3.13dist-agate-lookup \
python313-agate-lookup \
python3dist-agate-lookup"

RDEPENDS:${PN} += "python-abi \
python313-PyYAML \
python313-agate \
python313-requests"

inherit rpm
