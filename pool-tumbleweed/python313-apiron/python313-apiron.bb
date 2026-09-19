SUMMARY = "Apiron helps you cook a tasty client for RESTful APIs"
DESCRIPTION = "Gathering data from multiple services has become a ubiquitous task for web application developers. The complexity can grow quickly: calling an API endpoint with multiple parameter sets, calling multiple API endpoints, calling multiple endpoints in multiple APIs. While the business logic can get hairy, the code to interact with those APIs doesn't have to. \
 \
apiron provides declarative, structured configuration of services and endpoints with a unified interface for interacting with them."
LICENSE = "MIT"

PV = "9.1.0"

RPM_NAME = "python313-apiron-9.1.0-1.4.noarch.rpm"
RPM_HASH = "cae196ad1c6cd0030c1ad8644b1092c9fb880313f6bf4f7a9357390662be8465d2b2e733004a552a3cf77de925903b409f23b44ef88ebd5cceb3fa50eba57084"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-apiron \
python3.13dist-apiron \
python313-apiron \
python3dist-apiron"

RDEPENDS:${PN} += "python-abi \
python313-requests"

inherit rpm
