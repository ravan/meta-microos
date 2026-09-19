SUMMARY = "A tool for testing Jupyter kernels"
DESCRIPTION = "jupyter_kernel_test is a tool for testing Jupyter kernels. It tests kernels for \
successful code execution and conformance with the Jupyter Messaging Protocol."
LICENSE = "BSD-3-Clause"

PV = "0.7.0"

RPM_NAME = "python313-jupyter-kernel-test-0.7.0-1.9.noarch.rpm"
RPM_HASH = "04c5620f0f1a84ddd4f036163ddfec78e7d1751e2ad9d015742bb92a297df2cd4c964543034acbfc282d2b1a9e95acefb4baf09d7b6a0c3654ec78f178a766ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-kernel-test \
python3.13dist-jupyter-kernel-test \
python313-jupyter-kernel-test \
python3dist-jupyter-kernel-test"

RDEPENDS:${PN} += "python-abi \
python313-jsonschema \
python313-jupyter-client"

inherit rpm
