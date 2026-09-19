SUMMARY = "AutoRest swagger generator - Azure-specific module"
DESCRIPTION = "AutoRest swagger generator Python client runtime. Azure-specific module."
LICENSE = "MIT"

PV = "0.6.4"

RPM_NAME = "python313-msrestazure-0.6.4-5.9.noarch.rpm"
RPM_HASH = "89c5c20ddc24499b651cb816328106af8c4a1b296111189588196815d1f43cb9293cb28b4849273496650fd29867900946367fca95104279496493eef53fc3b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-msrestazure \
python3.13dist-msrestazure \
python313-msrestazure \
python3dist-msrestazure"

RDEPENDS:${PN} += "-python313-adal >= 0.6.0 with python313-adal < 2.0.0 \
-python313-msrest >= 0.6.0 with python313-msrest < 2.0.0 \
python-abi \
python313-six"

inherit rpm
