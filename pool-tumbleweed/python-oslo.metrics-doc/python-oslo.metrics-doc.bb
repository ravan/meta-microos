SUMMARY = "Docs for oslo.metrics"
DESCRIPTION = "Documentation for the oslo.metrics library."
LICENSE = "Apache-2.0"

PV = "0.17.0"

RPM_NAME = "python-oslo.metrics-doc-0.17.0-1.1.noarch.rpm"
RPM_HASH = "22d9c47e2f8913bfba72ad5f5f3521b7f8f6b143dc9ab89fb8cf97a4d451e6089e829897d3cb9308eb7c04a312a9b58274746581959e7f1a893f9674f09c4695"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-oslo.metrics-doc"

RDEPENDS:${PN} += ""

inherit rpm
