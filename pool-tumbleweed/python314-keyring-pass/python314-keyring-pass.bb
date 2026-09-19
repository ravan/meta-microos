SUMMARY = "Pass backend for python-keyring"
DESCRIPTION = "python-keyring backend getting data from pass."
LICENSE = "MIT"

PV = "0.9.3"

RPM_NAME = "python314-keyring-pass-0.9.3-1.5.noarch.rpm"
RPM_HASH = "301f3938235bb6ea2e2dff3c2a4f5a3dc093d8dabd837f8550d125f6a14c3d7724c6b45ce1f5d307b4dc3b0311e5f36b94e68501009c347d828d915029b28093"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-keyring-pass \
python314-keyring-pass \
python3dist-keyring-pass"

RDEPENDS:${PN} += "password-store \
python-abi \
python314-jaraco.classes \
python314-keyring"

inherit rpm
