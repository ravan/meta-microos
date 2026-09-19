SUMMARY = "Open source, general-purpose policy engine"
DESCRIPTION = "Open Policy Agent (OPA) is an open source, general-purpose policy engine that \
enables unified, context-aware policy enforcement across the entire stack. \
 \
OPA is proud to be a graduated project in the Cloud Native Computing Foundation \
(CNCF) landscape."
LICENSE = "Apache-2.0"

PV = "1.20.1"

RPM_NAME = "opa-1.20.1-1.1.aarch64.rpm"
RPM_HASH = "081cdd0ad4a4fb7c1d7876f246756c93bb84ec2f72f682fc9d4c5308dcd598433008d28bfc6a65612e19a2535947d124b4916c176ceb884a2d02afe74bf91fad"

RPROVIDES:${PN} += "opa"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
