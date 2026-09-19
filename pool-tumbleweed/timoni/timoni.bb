SUMMARY = "Package manager for Kubernetes, powered by CUE and inspired by Helm"
DESCRIPTION = "Timoni is a package manager for Kubernetes, powered by CUE and inspired by \
Helm. \
 \
The Timoni project strives to improve the UX of authoring Kubernetes configs. \
Instead of mingling Go templates with YAML like Helm, or layering YAML on top \
of each-other like Kustomize, Timoni relies on cuelang's type safety, code \
generation and data validation features to offer a better experience of \
creating, packaging and delivering apps to Kubernetes."
LICENSE = "Apache-2.0"

PV = "0.33.0"

RPM_NAME = "timoni-0.33.0-1.1.aarch64.rpm"
RPM_HASH = "763c021ec263a3a9ba8f419bc56b29c7c562f307744b652044e2698a2ed108ba4ee585d332bba55e2b6496ddcb15af64d0e0fade06a0c761598565ee54bc4930"

RPROVIDES:${PN} += "timoni"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
