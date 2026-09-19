SUMMARY = "A tool for testing Jupyter kernels"
DESCRIPTION = "jupyter_kernel_test is a tool for testing Jupyter kernels. It tests kernels for \
successful code execution and conformance with the Jupyter Messaging Protocol."
LICENSE = "BSD-3-Clause"

PV = "0.7.0"

RPM_NAME = "python314-jupyter-kernel-test-0.7.0-1.9.noarch.rpm"
RPM_HASH = "f1f7d90b4efadb7ce978c4b453bad1e3932a1486cc779d5349924a7e1ac3d30791bdac98059b91e66cc75c226dda5fc9dad640d5203ad25a1af1a60d9fef37b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jupyter-kernel-test \
python314-jupyter-kernel-test \
python3dist-jupyter-kernel-test"

RDEPENDS:${PN} += "python-abi \
python314-jsonschema \
python314-jupyter-client"

inherit rpm
