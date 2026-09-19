SUMMARY = "Google BigQuery API client library"
DESCRIPTION = "Querying massive datasets can be time consuming and expensive without the right \
hardware and infrastructure. Google BigQuery solves this problem by enabling \
super-fast, SQL queries against append-mostly tables, using the processing \
power of Google's infrastructure."
LICENSE = "Apache-2.0"

PV = "3.41.0"

RPM_NAME = "python314-google-cloud-bigquery-3.41.0-1.2.noarch.rpm"
RPM_HASH = "f194974910347231c0e6c37d76fbb22b69606360fd2a415d1d9d64f781fe2b7522adea4fbf1304c286b599418b0dafda1414ac1e0f44ffceb02aa1122e380cb2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-google-cloud-bigquery \
python314-google-cloud-bigquery \
python3dist-google-cloud-bigquery"

RDEPENDS:${PN} += "python-abi \
python314-google-api-core \
python314-google-auth \
python314-google-cloud-core \
python314-google-resumable-media \
python314-packaging \
python314-python-dateutil \
python314-requests"

inherit rpm
