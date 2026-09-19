SUMMARY = "Test utilities for OpenTelemetry unit tests"
DESCRIPTION = "OpenTelemetry Test Utilities \
 \
This package provides internal testing utilities for the OpenTelemetry Python \
project and provides no stability or quality guarantees.  Please do not use it \
for anything other than writing or running tests for the OpenTelemetry Python \
project (github.com/open-telemetry/opentelemetry-python)."
LICENSE = "Apache-2.0"

PV = "0.64b0"

RPM_NAME = "python314-opentelemetry-test-utils-0.64b0-1.1.noarch.rpm"
RPM_HASH = "43ea69f1fff5169a310552c8f395a82208c81e605310018ac9ad06a2e3d9909746d91b390f340a7562f08db39ab6b7ebb5f84769250a30c9ca1cb59cfd1ea04a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-opentelemetry-test-utils \
python314-opentelemetry-test-utils \
python3dist-opentelemetry-test-utils"

RDEPENDS:${PN} += "python-abi \
python314-asgiref \
python314-opentelemetry-api \
python314-opentelemetry-sdk"

inherit rpm
