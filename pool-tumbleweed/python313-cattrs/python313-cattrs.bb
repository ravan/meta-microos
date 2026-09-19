SUMMARY = "Composable complex class support for attrs and dataclasses"
DESCRIPTION = "Composable complex class support for attrs and dataclasses."
LICENSE = "MIT"

PV = "26.1.0"

RPM_NAME = "python313-cattrs-26.1.0-1.2.noarch.rpm"
RPM_HASH = "cb3fab1c1f138df35c7aac78bdf02562c2c005e670fe64a9c7f023d086e15556a19db4e1392bd66e34cc02ce9f1bde5a8e2710a2b308c3d798f9d323249589e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cattrs \
python3.13dist-cattrs \
python313-cattrs \
python3dist-cattrs"

RDEPENDS:${PN} += "python-abi \
python313-attrs \
python313-typing-extensions"

inherit rpm
