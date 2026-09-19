SUMMARY = "Fish Completion for kustomize"
DESCRIPTION = "Fish command line completion support for kustomize."
LICENSE = "Apache-2.0"

PV = "5.8.1"

RPM_NAME = "kustomize-fish-completion-5.8.1-1.4.noarch.rpm"
RPM_HASH = "878c6c0a2ac47ff4d70b2213c7c5a9c15e639220e14c2ca6209705f2055f0c4c3cfb6252be0c8387b0a0388029572c881fd9577b475e766cf6afb14086f6758e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kustomize-fish-completion"

RDEPENDS:${PN} += "kustomize"

inherit rpm
