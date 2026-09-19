SUMMARY = "Python SDKs for the Slack API"
DESCRIPTION = "The Slack platform offers several APIs to build apps. Each Slack API delivers \
part of the capabilities from the platform, so that you can pick just those \
that fit for your needs. This SDK offers a corresponding package for each of \
Slack’s APIs. They are small and powerful when used independently, and work \
seamlessly when used together, too."
LICENSE = "MIT"

PV = "3.19.5"

RPM_NAME = "python39-slack-sdk-3.19.5-1.1.noarch.rpm"
RPM_HASH = "3186b152f04400232be52eb83429057ae7a883db2a87185d3ba23aafe5ae897af519a900a7729c093adb20103a1076e58bcf7fbbb922b1ae11ffd546a07233f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-slack-sdk \
python39-slack-sdk \
python39-slackclient \
python3dist-slack-sdk"

RDEPENDS:${PN} += "python-abi"

inherit rpm
