SUMMARY = "A library to identify device capabilities (phones, tablets)"
DESCRIPTION = "Python library that can identify/detect devices like mobile phones, \
tablets and their capabilities by parsing (browser/HTTP) user agent \
strings."
LICENSE = "MIT"

PV = "2.2.0"

RPM_NAME = "python314-user-agents-2.2.0-2.12.noarch.rpm"
RPM_HASH = "a035cceebb42c7f38c780f0f32c017d7c3a3b53f13b07262c20ab874b9bd9aeb516026a5a14716757e818ebb157663fd4ac3bca61d15edf166f2e25a6f8f0775"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-user-agents \
python314-user-agents \
python3dist-user-agents"

RDEPENDS:${PN} += "python-abi \
python314-ua-parser"

inherit rpm
