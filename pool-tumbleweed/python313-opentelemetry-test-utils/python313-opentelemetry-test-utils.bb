SUMMARY = "Test utilities for OpenTelemetry unit tests"
DESCRIPTION = "OpenTelemetry Test Utilities \
 \
This package provides internal testing utilities for the OpenTelemetry Python \
project and provides no stability or quality guarantees.  Please do not use it \
for anything other than writing or running tests for the OpenTelemetry Python \
project (github.com/open-telemetry/opentelemetry-python)."
LICENSE = "Apache-2.0"

PV = "0.64b0"

RPM_NAME = "python313-opentelemetry-test-utils-0.64b0-1.1.noarch.rpm"
RPM_HASH = "4de3bd765feea18114ae83c3a414d443a1abe545c475cdc4fc0d545511c48273bf2b0df016c7535520fae48e2fc0fac207d62cefaef9c590e9032574dbe1cf32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-opentelemetry-test-utils \
python3.13dist-opentelemetry-test-utils \
python313-opentelemetry-test-utils \
python3dist-opentelemetry-test-utils"

RDEPENDS:${PN} += "python-abi \
python313-asgiref \
python313-opentelemetry-api \
python313-opentelemetry-sdk"

inherit rpm
