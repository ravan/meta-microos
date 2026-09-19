SUMMARY = "Python SDKs for the Slack API"
DESCRIPTION = "The Slack platform offers several APIs to build apps. Each Slack API delivers \
part of the capabilities from the platform, so that you can pick just those \
that fit for your needs. This SDK offers a corresponding package for each of \
Slack’s APIs. They are small and powerful when used independently, and work \
seamlessly when used together, too."
LICENSE = "MIT"

PV = "3.42.0"

RPM_NAME = "python314-slack-sdk-3.42.0-1.1.noarch.rpm"
RPM_HASH = "72a50dd2dd52e4772f3835ce7325a867a2295a2fe0f6e7ff02086eb6c09f6a5beda2542ceabeed82a88806e3bebd1785c1abca7930ad42817942110c8e40cf7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-slack-sdk \
python314-slack-sdk \
python314-slackclient \
python3dist-slack-sdk"

RDEPENDS:${PN} += "python-abi"

inherit rpm
