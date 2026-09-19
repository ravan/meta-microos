SUMMARY = "CLI for the Kubernetes Application lifecycle orchestration"
DESCRIPTION = "Kargo is a next-generation continuous delivery and application lifecycle \
orchestration platform for Kubernetes. It builds upon GitOps principles and \
integrates with existing technologies, like Argo CD, to streamline and automate \
the progressive rollout of changes across the many stages of an application's \
lifecycle."
LICENSE = "Apache-2.0"

PV = "1.11.2"

RPM_NAME = "kargo-cli-1.11.2-1.1.aarch64.rpm"
RPM_HASH = "e6c814e3c160fccdad0f3d509646f7971f6face6dc7419e7032ac72525c86eb01cbb3cf28b1d30ed5395325eef7e27b7187ee7f87901709235477eba3f568275"

RPROVIDES:${PN} += "kargo-cli"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
