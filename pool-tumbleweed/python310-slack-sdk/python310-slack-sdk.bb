SUMMARY = "Python SDKs for the Slack API"
DESCRIPTION = "The Slack platform offers several APIs to build apps. Each Slack API delivers \
part of the capabilities from the platform, so that you can pick just those \
that fit for your needs. This SDK offers a corresponding package for each of \
Slack’s APIs. They are small and powerful when used independently, and work \
seamlessly when used together, too."
LICENSE = "MIT"

PV = "3.19.5"

RPM_NAME = "python310-slack-sdk-3.19.5-1.1.noarch.rpm"
RPM_HASH = "9308e85bdd1589979925fcfde811746c845fae326fa24ad6f2aca879d2905879857fc888b6c1f13d10e96061785b5c2dfdaad40df7e8bc976d3f79d0e081d422"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-slack-sdk \
python3-slackclient \
python3.10dist-slack-sdk \
python310-slack-sdk \
python310-slackclient \
python3dist-slack-sdk"

RDEPENDS:${PN} += "python-abi"

inherit rpm
