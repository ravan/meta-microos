SUMMARY = "Python SDKs for the Slack API"
DESCRIPTION = "The Slack platform offers several APIs to build apps. Each Slack API delivers \
part of the capabilities from the platform, so that you can pick just those \
that fit for your needs. This SDK offers a corresponding package for each of \
Slack’s APIs. They are small and powerful when used independently, and work \
seamlessly when used together, too."
LICENSE = "MIT"

PV = "3.42.0"

RPM_NAME = "python313-slack-sdk-3.42.0-1.1.noarch.rpm"
RPM_HASH = "1995c05481690916c5e9e394c9e4f6b195e24b6a30c301a9f9a11921420e5abb2a54decd1d439e7802cc71774253041cd54410e82355963333a504b0523cb769"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-slack-sdk \
python3-slackclient \
python3.13dist-slack-sdk \
python313-slack-sdk \
python313-slackclient \
python3dist-slack-sdk"

RDEPENDS:${PN} += "python-abi"

inherit rpm
