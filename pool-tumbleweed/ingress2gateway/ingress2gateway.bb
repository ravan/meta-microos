SUMMARY = "Convert Ingress resources to Gateway API resources"
DESCRIPTION = "Ingress2gateway helps translate Ingress and provider-specific resources (CRDs) \
to Gateway API resources. Ingress2gateway is managed by the Gateway API \
SIG-Network subproject. \
 \
Scope \
 \
Ingress2gateway is primarily focused on translating Ingress and \
provider-specific resources(CRDs) to Gateway API resources. Widely used \
provider-specific annotations and/or CRDs may still not be supported. Please \
refer to supported providers for the current supported providers and their \
documentation. Contributions for provider-specific annotations and/or CRDs \
support are mostly welcomed as long as they can be translated to Gateway API \
directly. \
 \
Note: \
Ingress2gateway is not intended to copy annotations from Ingress to Gateway \
API."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "ingress2gateway-1.2.0-1.2.aarch64.rpm"
RPM_HASH = "2f358ad5a4476888abc83ba860f362d80a154580abe3c70f1de5c45eca66c27ddfecae11247b3220d2131c076f3bb8ba5cab654d9b7837c72aa52a6b26f3fc79"

RPROVIDES:${PN} += "ingress2gateway"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
