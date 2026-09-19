SUMMARY = "Opinionated way of installing Argo-CD"
DESCRIPTION = "New users to GitOps and Argo CD are not often sure how they should structure \
their repos, add applications, promote apps across environments, and manage the \
Argo CD installation itself using GitOps. \
 \
Argo CD Autopilot saves operators time by: \
* Installing and managing the Argo CD application using GitOps. \
* Providing a clear structure for how applications are to be added and updated, \
  all from git. \
* Creating a simple pattern for making updates to applications and promoting \
  those changes across environments. \
* Enabling better disaster recovery by being able to bootstrap new clusters \
  with all the applications previously installed. \
* Handling secrets for Argo CD to prevent them from spilling into plaintext \
  git. (Soon to come) \
 \
The Argo-CD Autopilot is a tool which offers an opinionated way of installing \
Argo-CD and managing GitOps repositories."
LICENSE = "Apache-2.0"

PV = "0.4.20"

RPM_NAME = "argocd-autopilot-0.4.20-1.8.aarch64.rpm"
RPM_HASH = "532932ab8ca947aa4f518a99b14137cc6fc67a39f6b99dc64926bf79826118fa8b9546340999181b6cebf998115c650fd732d81faea7d9e6d144474f1ff1b31f"

RPROVIDES:${PN} += "argocd-autopilot"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
