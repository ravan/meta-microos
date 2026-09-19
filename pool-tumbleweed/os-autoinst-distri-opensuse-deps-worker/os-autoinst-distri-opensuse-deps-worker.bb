SUMMARY = "Convenience package pulling in os-autoinst-distri-openSUSE dependencies and the openQA worker"
DESCRIPTION = "Convenience package pulling in os-autoinst-distri-openSUSE dependencies and the openQA worker."
LICENSE = "MIT"

PV = "1.1770726271.4c22ee70"

RPM_NAME = "os-autoinst-distri-opensuse-deps-worker-1.1770726271.4c22ee70-1.3.noarch.rpm"
RPM_HASH = "7269af52ff851683f5595de18bd4a6ff6f44ff3fa25e1915b8f58eb9649d9e5f4a08ca312b1fdad1cfdee796597d42efc73f2c7333bbde2032efcde30f69ca6a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "os-autoinst-distri-opensuse-deps-worker"

RDEPENDS:${PN} += "openQA-worker \
os-autoinst-distri-opensuse-deps"

inherit rpm
