SUMMARY = "Kubectl plugin for browsing PVCs on the command line"
DESCRIPTION = "I constantly found myself spinning up dummy pods to exec into them so I could \
browse a PVC, this takes a few steps out of creating dummy pods to check out \
the contents of a PVC. \
 \
Usage \
 \
`kubectl browse-pvc -n <namespace> <pvc-name>` \
 \
On an unbound PVC. The tool spins up a pod that mounts the PVC and then execs \
into it allowing you to modify the contents of the PVC. The Job finishes and \
cleans up the pod when you disconnect."
LICENSE = "MIT"

PV = "1.4.4"

RPM_NAME = "kubectl-browse-pvc-1.4.4-1.4.aarch64.rpm"
RPM_HASH = "e87b988717e72b924bd21be177fe2d026815c0bbde806161b153a073e610b36303dca3298bce09fd03e5d407240fc525b90a5958e92e3301efd84246a5100abc"

RPROVIDES:${PN} += "kubectl-browse-pvc"

RDEPENDS:${PN} += ""

inherit rpm
