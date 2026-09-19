SUMMARY = "Apiron helps you cook a tasty client for RESTful APIs"
DESCRIPTION = "Gathering data from multiple services has become a ubiquitous task for web application developers. The complexity can grow quickly: calling an API endpoint with multiple parameter sets, calling multiple API endpoints, calling multiple endpoints in multiple APIs. While the business logic can get hairy, the code to interact with those APIs doesn't have to. \
 \
apiron provides declarative, structured configuration of services and endpoints with a unified interface for interacting with them."
LICENSE = "MIT"

PV = "9.1.0"

RPM_NAME = "python314-apiron-9.1.0-1.4.noarch.rpm"
RPM_HASH = "6a4c5b18fb60e505bebd0555ef27967fcd07d72f9e45deffeb96ae81d64370cda018dababd1440019f35fbb47f859a6175b215aff9d605db782869953624db60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-apiron \
python314-apiron \
python3dist-apiron"

RDEPENDS:${PN} += "python-abi \
python314-requests"

inherit rpm
