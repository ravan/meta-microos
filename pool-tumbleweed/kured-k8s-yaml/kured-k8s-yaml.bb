SUMMARY = "Kubernetes yaml file to run kured container"
DESCRIPTION = "This package contains the yaml file requried to download and run the \
kured container in a kubernetes cluster."
LICENSE = "Apache-2.0"

PV = "1.21.0"

RPM_NAME = "kured-k8s-yaml-1.21.0-1.7.noarch.rpm"
RPM_HASH = "14990a1cc8c42687bff5f47cef7c5c69a46f775092e27561174a30ee7984838d1b4ad7f89aea0826ada09f9dda8659740dfd996ad62caf1dce234cd4f66b128c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kured-k8s-yaml"

RDEPENDS:${PN} += ""

inherit rpm
