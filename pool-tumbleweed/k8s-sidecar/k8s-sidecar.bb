SUMMARY = "Collect kubernetes cluster configmaps and store it"
DESCRIPTION = "Collect kubernetes cluster configmaps with a specified label and store the included files in an local folder."
LICENSE = "MIT"

PV = "0.1.144"

RPM_NAME = "k8s-sidecar-0.1.144-1.15.noarch.rpm"
RPM_HASH = "b288d23b41cbc7bc748366989c6e2cf87689a4d9eace8314db5b968ce797836feb5fbce87849c655d9039f58ee1bca45a07e8e3aebb409d42f9f2a7555d263a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "k8s-sidecar"

RDEPENDS:${PN} += "python3 \
python3-kubernetes \
python3-requests"

inherit rpm
