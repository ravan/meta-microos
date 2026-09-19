SUMMARY = "Support multiple formats with ease"
DESCRIPTION = "Formats will provide you with a consistent API to parse and compose data."
LICENSE = "MIT"

PV = "0.1.1"

RPM_NAME = "python313-formats-0.1.1-2.5.noarch.rpm"
RPM_HASH = "4265f84eee5a57084e65be13d1c93a3a6251b298bf6d2f216f0b3cbdf813dc29288629a40e38245df2d162a582b365337b4ffb43de21144fb7fcae355bcc71b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-formats \
python3.13dist-formats \
python313-formats \
python3dist-formats"

RDEPENDS:${PN} += "python-abi"

inherit rpm
