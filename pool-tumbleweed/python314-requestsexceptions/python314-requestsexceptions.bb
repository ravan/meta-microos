SUMMARY = "Import exceptions from potentially bundled packages in requests"
DESCRIPTION = "The python requests library bundles the urllib3 library, however, some \
software distributions modify requests to remove the bundled library. \
This makes some operations, such as supressing the 'insecure platform \
warning' messages that urllib emits difficult.  This is a simple \
library to find the correct path to exceptions in the requests library \
regardless of whether they are bundled."
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "python314-requestsexceptions-1.4.0-3.5.noarch.rpm"
RPM_HASH = "2574992917243e60e98bba2e8036adb238afba71d4dbd13211893af9058c405c753cbf1b9f125a747e38a3002d4a2294607724ce0288ba478866d23a6824ab41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-requestsexceptions \
python314-requestsexceptions \
python3dist-requestsexceptions"

RDEPENDS:${PN} += "python-abi"

inherit rpm
