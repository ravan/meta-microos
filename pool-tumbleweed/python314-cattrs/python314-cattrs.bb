SUMMARY = "Composable complex class support for attrs and dataclasses"
DESCRIPTION = "Composable complex class support for attrs and dataclasses."
LICENSE = "MIT"

PV = "26.1.0"

RPM_NAME = "python314-cattrs-26.1.0-1.2.noarch.rpm"
RPM_HASH = "46de39db1053a7e4d66d6836bae6abb1208405268c4580bea54ad19f5a494360e3da1cb2291ce154695cdac369aa44db17c50e67c89d186619271df4bce17f4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-cattrs \
python314-cattrs \
python3dist-cattrs"

RDEPENDS:${PN} += "python-abi \
python314-attrs \
python314-typing-extensions"

inherit rpm
