SUMMARY = "Scans a k8s cluster for misconfigurations and vulnerabilities"
DESCRIPTION = "Marvin is a CLI tool designed to help Kubernetes cluster administrators ensure \
the security and reliability of their environments. \
 \
Using a comprehensive set of CEL (Common Expression Language) expressions, \
Marvin performs extensive checks on cluster resources, identifying potential \
issues, misconfigurations, and vulnerabilities that could pose a risk to the \
system. It helps ensure that your Kubernetes clusters are always in compliance \
with best practices and industry standards. \
 \
Marvin is also used as a plugin in Zora."
LICENSE = "Apache-2.0"

PV = "0.2.13"

RPM_NAME = "marvin-0.2.13-1.1.aarch64.rpm"
RPM_HASH = "3dcb29425f3883069f0cd9488956916e6845710b277d8e078bcf2ff2692568fde78e4d2c63a157140a2a11df70ed948e5eae00bbe6882e17c230ebc6d2874416"

RPROVIDES:${PN} += "marvin"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
