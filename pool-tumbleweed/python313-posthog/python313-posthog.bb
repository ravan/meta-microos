SUMMARY = "PostHog is developer-friendly, self-hosted product analytics"
DESCRIPTION = "PostHog is developer-friendly, self-hosted product analytics. Integrate PostHog into any python application"
LICENSE = "MIT"

PV = "7.14.2"

RPM_NAME = "python313-posthog-7.14.2-1.2.noarch.rpm"
RPM_HASH = "2a5f59f9a0b596a8ef607bd8ee948a66c08ecb0ad74f80909ae09a3f2b213d0bc45950fb491d51fc7dc31a7182ade6b372ff906f270d70df3530c2ee1bba2b7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-posthog \
python3.13dist-posthog \
python313-posthog \
python3dist-posthog"

RDEPENDS:${PN} += "python-abi \
python313-backoff \
python313-distro \
python313-requests \
python313-typing-extensions"

inherit rpm
