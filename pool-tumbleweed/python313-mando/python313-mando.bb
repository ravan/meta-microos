SUMMARY = "Python wrapper around argparse, a tool to create CLI apps"
DESCRIPTION = "Mando is a wrapper around argparse, and allows writing CLI \
applications."
LICENSE = "MIT"

PV = "0.8.2"

RPM_NAME = "python313-mando-0.8.2-1.3.noarch.rpm"
RPM_HASH = "35d1f114531656f66383aaef3d8bb84be5b7166d44167e9e50398221df1319b245a00529c0094a47f95f5c029a23cd134a19890ac6ddd1c81bb9e8b744f3296e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mando \
python3.13dist-mando \
python313-mando \
python3dist-mando"

RDEPENDS:${PN} += "python-abi"

inherit rpm
