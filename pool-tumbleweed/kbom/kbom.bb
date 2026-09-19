SUMMARY = "Kubernetes Bill of Materials"
DESCRIPTION = "The Kubernetes Bill of Materials (KBOM) standard provides insight into \
container orchestration tools widely used across the industry. \
 \
As a first draft, we have created a rough specification which should fall in \
line with other Bill of Materials (BOM) standards. \
 \
The KBOM project provides an initial specification in JSON and has been \
constructed for extensibilty across various cloud service providers (CSPs) as \
well as DIY Kubernetes."
LICENSE = "Apache-2.0"

PV = "0.3.4"

RPM_NAME = "kbom-0.3.4-1.4.aarch64.rpm"
RPM_HASH = "c05f3c1e81421ebee83c625fe8183c3ff9a67bdf727134b9c9c0488f3af04793355aea987944abbe1b846f759dc51144c23fef7df263b55763cce9a4f3548139"

RPROVIDES:${PN} += "kbom"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
