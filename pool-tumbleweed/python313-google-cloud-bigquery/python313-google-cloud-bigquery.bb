SUMMARY = "Google BigQuery API client library"
DESCRIPTION = "Querying massive datasets can be time consuming and expensive without the right \
hardware and infrastructure. Google BigQuery solves this problem by enabling \
super-fast, SQL queries against append-mostly tables, using the processing \
power of Google's infrastructure."
LICENSE = "Apache-2.0"

PV = "3.41.0"

RPM_NAME = "python313-google-cloud-bigquery-3.41.0-1.2.noarch.rpm"
RPM_HASH = "8ccaf0b95481f9c9a15896df00cc22d22ce326b437cf31337d30d3691d44b5a32ed8567c299789153504572ab20ea30aba4dfdec4fecf9cc1ff2fe0a49b9e6ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-google-cloud-bigquery \
python3.13dist-google-cloud-bigquery \
python313-google-cloud-bigquery \
python3dist-google-cloud-bigquery"

RDEPENDS:${PN} += "python-abi \
python313-google-api-core \
python313-google-auth \
python313-google-cloud-core \
python313-google-resumable-media \
python313-packaging \
python313-python-dateutil \
python313-requests"

inherit rpm
