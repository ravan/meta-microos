SUMMARY = "Tool to discover unused Kubernetes Resources"
DESCRIPTION = "Kor is a tool to discover unused Kubernetes resources. Currently, Kor can identify and list unused: \
- ConfigMaps \
- Secrets \
- Services \
- ServiceAccounts \
- Deployments \
- StatefulSets \
- Roles \
- HPAs \
- PVCs \
- Ingresses \
- PDBs"
LICENSE = "MIT"

PV = "0.6.8"

RPM_NAME = "kor-0.6.8-1.4.aarch64.rpm"
RPM_HASH = "a5505ae0ab88371c2af34c1323ed36008b739c78017b3d44c09f83628b4d43c199db364a9680c91f9294a5819c90a185075c7c330d171f05cee78aacd4b4f090"

RPROVIDES:${PN} += "kor"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
