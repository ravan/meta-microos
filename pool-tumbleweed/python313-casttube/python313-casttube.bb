SUMMARY = "YouTube chromecast api"
DESCRIPTION = "casttube provides a way to interact with the Youtube Chromecast api."
LICENSE = "MIT"

PV = "0.2.1"

RPM_NAME = "python313-casttube-0.2.1-3.5.noarch.rpm"
RPM_HASH = "97bbee766f6f153527e60119d618021ba0a5eb534a467b3eb0d7dfa9652d5c97295b3c0441ec13e0605e8d54302ebb5e0917319e22c0c4e32007d6d1b0f1b8a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-casttube \
python3.13dist-casttube \
python313-casttube \
python3dist-casttube"

RDEPENDS:${PN} += "python-abi \
python313-requests"

inherit rpm
