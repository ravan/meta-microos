SUMMARY = "CLI for the Werf CI/CD system"
DESCRIPTION = "werf is a CNCF Sandbox CLI tool to implement full-cycle CI/CD to Kubernetes easily. werf integrates into your CI system and leverages familiar and reliable technologies, such as Git, Dockerfile, Helm, and Buildah. \
 \
What makes werf special: \
* Complete application lifecycle management: build and publish container images, test, deploy an application to Kubernetes, distribute release artifacts and clean up the container registry. \
* Ease of use: use Dockerfiles and Helm chart for configuration and let werf handle all the rest. \
* Advanced features: automatic build caching and content-based tagging, enhanced resource tracking and extra capabilities in Helm, a unique container registry cleanup approach, and more. \
* Gluing common technologies: Git, Buildah, Helm, Kubernetes, and your CI system of choice. \
* Production-ready: werf has been used in production since 2017; thousands of projects rely on it to build & deploy various apps."
LICENSE = "Apache-2.0"

PV = "2.75.3"

RPM_NAME = "werf-2.75.3-1.1.aarch64.rpm"
RPM_HASH = "7b76ca4b324df6a8d4b11e49b6238634b4bc7cca991e15473adab6181da908c86d06c3569961b64d429734358269eae408ea1b46ea0b0269532ee92aac7af02f"

RPROVIDES:${PN} += "werf"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
