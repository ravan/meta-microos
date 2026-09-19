SUMMARY = "Kubernetes yaml file to run rbac-manager"
DESCRIPTION = "This package contains the yaml file requried to download and run the \
rbac-manager in a kubernetes cluster."
LICENSE = "Apache-2.0"

PV = "1.10.2"

RPM_NAME = "rbac-manager-k8s-yaml-1.10.2-1.1.noarch.rpm"
RPM_HASH = "75f1dd845ed6b5f688ff49e44cedfc725a7e4b7656183798eb8cbc5f73218f361878bc4f62548126e64db06b7b07178d104b9fbc84ee47fb335a63c12c521383"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rbac-manager-k8s-yaml"

RDEPENDS:${PN} += ""

inherit rpm
