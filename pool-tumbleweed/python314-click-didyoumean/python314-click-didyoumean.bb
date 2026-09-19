SUMMARY = "Plugin to enable git-like did-you-mean feature in python-click"
DESCRIPTION = "This package enables a git-like did-you-mean feature in click."
LICENSE = "MIT"

PV = "0.3.1"

RPM_NAME = "python314-click-didyoumean-0.3.1-1.9.noarch.rpm"
RPM_HASH = "f4a4c69833d414632a8fab464b2ffa176a9658627599c4ea51ea3f6ff354c1784b9927e9bacc3a07535a6e465adaee9ae4e5bc0bf1ef74d1cdba575a76c5eeef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-click-didyoumean \
python314-click-didyoumean \
python3dist-click-didyoumean"

RDEPENDS:${PN} += "python-abi \
python314-click"

inherit rpm
