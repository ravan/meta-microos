SUMMARY = "Instrumentation Tools & Auto Instrumentation for OpenTelemetry Python"
DESCRIPTION = "Instrumentation Tools & Auto Instrumentation for OpenTelemetry Python"
LICENSE = "Apache-2.0"

PV = "0.64b0"

RPM_NAME = "python314-opentelemetry-instrumentation-0.64b0-1.1.noarch.rpm"
RPM_HASH = "7783de71cf638a2004c16379dff7c086c5711acaafe1bb71bbcb5a4930be6b4f0bfbd403438a46c5843dee008ba3aa86221e551b3092ac33d24986f77560d3e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-opentelemetry-instrumentation \
python314-opentelemetry-instrumentation \
python3dist-opentelemetry-instrumentation"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-opentelemetry-api \
python314-opentelemetry-semantic-conventions \
python314-packaging \
python314-wrapt \
update-alternatives"

inherit rpm
