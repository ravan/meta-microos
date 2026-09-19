SUMMARY = "Emit fedmsg messages from mailman3"
DESCRIPTION = "Emit fedmsg messages from mailman3."
LICENSE = "LGPL-2.0-only"

PV = "0.5"

RPM_NAME = "python313-mailman3-fedmsg-plugin-0.5-2.10.noarch.rpm"
RPM_HASH = "7e63163e4b085c38da741b4b4366a7e525fd8f3bbe8b5ad2c857790bf0c52766bdd17f6b19e1561ca0b2579520cb031380267920418e61cd67e2415d6186b64a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mailman3-fedmsg-plugin \
python3.13dist-mailman3-fedmsg-plugin \
python313-mailman3-fedmsg-plugin \
python3dist-mailman3-fedmsg-plugin"

RDEPENDS:${PN} += "python-abi"

inherit rpm
