SUMMARY = "Import exceptions from potentially bundled packages in requests"
DESCRIPTION = "The python requests library bundles the urllib3 library, however, some \
software distributions modify requests to remove the bundled library. \
This makes some operations, such as supressing the 'insecure platform \
warning' messages that urllib emits difficult.  This is a simple \
library to find the correct path to exceptions in the requests library \
regardless of whether they are bundled."
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "python313-requestsexceptions-1.4.0-3.5.noarch.rpm"
RPM_HASH = "20e0454584f7632042ffd2c13f68120220c72b8bf3de556d79709af4757161452046c317f181cd8d22ffe818cb50a6572be982ae377625f7cde043472bda08bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-requestsexceptions \
python3.13dist-requestsexceptions \
python313-requestsexceptions \
python3dist-requestsexceptions"

RDEPENDS:${PN} += "python-abi"

inherit rpm
