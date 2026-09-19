SUMMARY = "Python SDKs for the Slack API"
DESCRIPTION = "The Slack platform offers several APIs to build apps. Each Slack API delivers \
part of the capabilities from the platform, so that you can pick just those \
that fit for your needs. This SDK offers a corresponding package for each of \
Slack’s APIs. They are small and powerful when used independently, and work \
seamlessly when used together, too."
LICENSE = "MIT"

PV = "3.19.5"

RPM_NAME = "python38-slack-sdk-3.19.5-1.1.noarch.rpm"
RPM_HASH = "f50036d42a8e10997eff9756cc28feefdf2eea3d5eb7cbd7db1d34a99a7afedd010779f494342063ebc01094cab7aae6d0f5e43694a8b01a3f8ff227558680b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.8dist-slack-sdk \
python38-slack-sdk \
python38-slackclient \
python3dist-slack-sdk"

RDEPENDS:${PN} += "python-abi"

inherit rpm
