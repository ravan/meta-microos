SUMMARY = "Tool to write tests against structured configuration data"
DESCRIPTION = "Conftest helps you write tests against structured configuration data. Using \
Conftest you can write tests for your Kubernetes configuration, Tekton pipeline \
definitions, Terraform code, Serverless configs or any other config files."
LICENSE = "Apache-2.0"

PV = "0.69.0"

RPM_NAME = "conftest-0.69.0-1.1.aarch64.rpm"
RPM_HASH = "a872680fd5c68494f4cd830962a5eae39fcf64c142e0a363a110b25171a0144eca7a230aa1f8e6930b1de2919a82641c3be13ba0f2bba7973548e28724a3b4d6"

RPROVIDES:${PN} += "conftest"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
