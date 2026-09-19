SUMMARY = "Fish Completion for kube-linter"
DESCRIPTION = "Fish command line completion support for kube-linter."
LICENSE = "Apache-2.0"

PV = "0.8.3"

RPM_NAME = "kube-linter-fish-completion-0.8.3-1.5.noarch.rpm"
RPM_HASH = "c634da0c8d2986dc10bc7a83f37b75f6a8e112f4ad21b52e5ebc7eefa857a9fb2e956a885fd4abddd1144c8d05c932af1282ae86af0406b6395dc84b17f5f2b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kube-linter-fish-completion"

RDEPENDS:${PN} += "kube-linter"

inherit rpm
