SUMMARY = "PostHog is developer-friendly, self-hosted product analytics"
DESCRIPTION = "PostHog is developer-friendly, self-hosted product analytics. Integrate PostHog into any python application"
LICENSE = "MIT"

PV = "7.14.2"

RPM_NAME = "python314-posthog-7.14.2-1.2.noarch.rpm"
RPM_HASH = "e42676d6e2db5451a1df132c2f38dbe30fc8cb64c0c6d119e72cc5712b65531358630c0d22b50c7832a8a175e1a1ab2913d9398dd3753ffbe1b678d270804a1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-posthog \
python314-posthog \
python3dist-posthog"

RDEPENDS:${PN} += "python-abi \
python314-backoff \
python314-distro \
python314-requests \
python314-typing-extensions"

inherit rpm
