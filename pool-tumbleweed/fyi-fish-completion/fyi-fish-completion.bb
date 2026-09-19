SUMMARY = "Fish completion for fyi"
DESCRIPTION = "Fish command line completion support for fyi."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "fyi-fish-completion-1.0.4-2.3.noarch.rpm"
RPM_HASH = "cb390a9f30c04018f0b7bcc7af86b01c404581477875e178cd89491f4ca178f46c728adb70475bcc0bf8fa2812a1dc813598bb2acee87e824a2ecbcd0ebb13eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fyi-fish-completion"

RDEPENDS:${PN} += "fyi"

inherit rpm
