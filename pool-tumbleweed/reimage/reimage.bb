SUMMARY = "Tool for mass update of images for kubernetes manifests"
DESCRIPTION = "A tool for mass update of images for kubernetes manifests. \
 \
This is a Work In Progress, YMMV, configuration and settings may change. \
 \
* Works with helm post-renderer, or arbitrary k8s manifests \
* Check images used by Deployments, StatefulSets, DaemonSets, Cronjobs and Job \
  (or arbitrary objects using jsonpath queries): \
** Exist (prevents deploy of manifests with bad references) \
** Remap tags (e.g latest) to a tag for the explicit digest they currently map to \
** Optionally copy images from third party repositories to known repository \
** Check that image scanning: \
*** has completed (with time limited check retry) \
*** images have no CVEs above a certain score (with overridable ignore list) \
* Can create GCP BinAuthz attestations for discovered image digests \
 \
This is intended to: \
 \
* Prevent deploying assets with un-pullable images \
* Localise images for faster start times \
* Potentially improve availability by reducing runtime third party service \
  dependencies (e.g. Dockerhub) \
* Help with compliance by pulling all images from registries with image scanning \
* Help with the use of in-cluster binary authorization"
LICENSE = "Apache-2.0"

PV = "0.15.1"

RPM_NAME = "reimage-0.15.1-1.2.aarch64.rpm"
RPM_HASH = "4df7855bb36dd08ea0fc5b4bdc5d57ab2fdd6203fbcee1fadfd3c7c84eeea483f1e3ee2eb0aab4b9e3742bd54b7c84bea492d9b663cf5166775b64fcdd328c85"

RPROVIDES:${PN} += "reimage"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
